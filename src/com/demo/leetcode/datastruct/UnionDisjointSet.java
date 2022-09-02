package com.demo.leetcode.datastruct;

public class UnionDisjointSet {
    int[] parent;

    public UnionDisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < parent.length; ++i) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int a, int b) {

        parent[find(a)] = find(b);
    }

}
