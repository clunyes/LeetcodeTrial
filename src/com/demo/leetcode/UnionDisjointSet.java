package com.demo.leetcode;

public class UnionDisjointSet {
    int[] parent;
    UnionDisjointSet(int n){
        parent = new int[n];
        for(int i = 0; i < parent.length; ++i){
            parent[i] = i;
        }
    }

    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int a, int b){

        parent[find(a)] = find(b);
    }

}
