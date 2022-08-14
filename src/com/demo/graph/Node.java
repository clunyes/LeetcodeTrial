package com.demo.graph;

import java.util.ArrayList;

public class Node {
    //值
    public int value;
    //入度，进入的点
    public int in;
    //出度，出去的点
    public int out;
    // 往外发射的点
    public ArrayList<Node> nexts;
    //往外发射的边
    public ArrayList<Edge> edges;

    public Node(int value) {
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<Edge>();
    }


}
