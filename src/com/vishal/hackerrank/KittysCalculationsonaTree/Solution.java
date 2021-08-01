package com.vishal.hackerrank.KittysCalculationsonaTree;

import java.io.*;
import java.util.*;

public class Solution {

    static final long MOD = 1_000_000_007;

    static int mul(long x, long y, long z) {
        return (int) ((((x * y) % MOD) * z) % MOD);
    }

    static int mul(long x, long y) {
        return (int) ((x * y) % MOD);
    }

    static int sum(long x, long y) {
        return (int) ((x + y) % MOD);
    }

    static int sum(long x, long y, long z) {
        return (int) ((x + y + z) % MOD);
    }

    static int[] nxt;
    static int[] succ;
    static int[] ptr;
    static int[] set;
    static int[] dep;
    static int[] parent;
    static int index = 1;

    static void addEdge(int u, int v) {
        nxt[index] = ptr[u];
        ptr[u] = index;
        parent[v] = u;
        succ[index++] = v;
    }

    static void bfsDeep(int source) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = ptr[u]; i > 0; i = nxt[i]) {
                int v = succ[i];
                q.add(v);
                dep[v] = dep[u] + 1;
            }
        }
    }

    static int lowestCommonAncestor(int u, int v) {
        if (dep[u] < dep[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        while (dep[u] > dep[v]) {
            u = parent[u];
        }

        if (u == v) {
            return u;
        }
        while (parent[u] != parent[v]) {
            u = parent[u];
            v = parent[v];
        }

        return parent[u];
    }

    static boolean[] visited;

    static int lowestCommonAncestorVis(int u, int v) {
        if (dep[u] < dep[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        visited[u] = false;
        visited[v] = false;
        while (dep[u] > dep[v]) {
            u = parent[u];
            visited[u] = false;
        }

        if (u == v) {
            return u;
        }
        while (parent[u] != parent[v]) {
            u = parent[u];
            v = parent[v];
            visited[u] = false;
            visited[v] = false;
        }
        visited[parent[u]] = false;

        return parent[u];
    }

    static boolean[] isSet;

    static class NodeDfs {
        int u;
        int count = 1;
        long parzialInv = 0;
        long sumNode = 0;
        long tot = 0;
        long parz2 = 0;
        NodeDfs parent = null;
        boolean start = true;

        public NodeDfs() {
        }

        public void reset(int u, NodeDfs parent) {
            this.u = u;
            this.parent = parent;
            parzialInv = tot = parz2 = sumNode = 0;
            start = true;
            count = 1;
        }
    }

    static int stackIndex = 0;
    static NodeDfs[] nodes;

    static NodeDfs dfs(int u) {
        NodeDfs root = nodes[0];
        root.reset(u, null);
        stackIndex = 1;

        while (stackIndex > 0) {
            NodeDfs node = nodes[stackIndex-1];
            if (node.start) {
                visited[node.u] = true;

                if (isSet[node.u]) {
                    for (int i = ptr[node.u]; i > 0; i = nxt[i]) {
                        if (!visited[succ[i]]) {
                            nodes[stackIndex].reset(succ[i], node);
                            stackIndex++;
                        }
                    }
                } else {
                    int uu = node.u;
                    while(true) {
                        int j = 0;
                        int v = 0;
                        for (int i = ptr[uu]; i > 0; i = nxt[i]) {
                            if (!visited[succ[i]]) {
                                nodes[stackIndex++].reset(v = succ[i], node);
                                j++;
                            }
                        }
                        if (isSet[v] || j != 1) {
                            break;
                        }
                        node.count++;
                        stackIndex--;
                        uu = v;
                    }
                }


                node.start = false;
            } else {
                if (node.count > 1) {
                    node.tot = sum(node.tot, mul(node.sumNode, node.parzialInv), MOD - node.parz2);
                    node.parzialInv = sum(node.parzialInv, mul(node.count-1, node.sumNode));
                } else {
                    node.tot = sum(node.tot, mul(node.sumNode, node.parzialInv), MOD - node.parz2);
                }
                if (isSet[node.u]) {
                    node.sumNode += node.u+1;
                }
                if (node.u != u) {
                    NodeDfs nodeP = node.parent;
                    nodeP.sumNode = sum(nodeP.sumNode, node.sumNode);
                    nodeP.parzialInv = sum(nodeP.parzialInv, node.parzialInv, node.sumNode);
                    nodeP.parz2 = sum(nodeP.parz2, mul(node.parzialInv + node.sumNode, node.sumNode));
                    if (isSet[nodeP.u]) {
                        nodeP.tot = sum(nodeP.tot, node.tot, mul(node.sumNode + node.parzialInv, (nodeP.u + 1)));
                    } else {
                        nodeP.tot = sum(nodeP.tot, node.tot);
                    }
                }

                stackIndex--;
            }
        }

        return root;
    }

    static final int MAX_SIMPLY = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        nxt = new int[2 * n];
        succ = new int[2 * n];
        ptr = new int[n];
        dep = new int[n];
        parent = new int[n];
        nodes = new NodeDfs[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new NodeDfs();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            if (u < v) {
                addEdge(u, v);
            } else {
                addEdge(v, u);
            }
        }
        bfsDeep(0);

        visited = new boolean[n];
        isSet = new boolean[n];

        for (int h = 1; h <= q; h++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            set = new int[k];
            if (k >= MAX_SIMPLY) {
                Arrays.fill(isSet, false);
            }
            for (int i = 0; i < k; i++) {
                int u = Integer.parseInt(st.nextToken()) - 1;
                isSet[u] = true;
                set[i] = u;
            }

            long result = 0;
            if (k < MAX_SIMPLY) {
                for (int i = 0; i < k - 1; i++) {
                    int x = set[i];
                    for (int j = i + 1; j < k; j++) {
                        int y = set[j];
                        int z = lowestCommonAncestor(x, y);
                        int dist = dep[y] + dep[x] - 2 * dep[z];
                        result = sum(result, mul(x + 1, y + 1, dist));
                    }
                }
            } else {
                Arrays.fill(visited, true);
                Arrays.sort(set);
                int x = set[set.length -1];
                for (int i = k-2; i >= 0; i--) {
                    if (visited[set[i]]) {
                        x = lowestCommonAncestorVis(x, set[i]);
                    }
                }
                NodeDfs node = dfs(x);
                result = node.tot;
            }
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}