package Graphs;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {

    int v1;
    int v2;
    int weight;

    Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}


public class Kruskal_Algorithm {

    private static int findParent(int v, int[] parent) {
        if (v == parent[v])
            return v;

        return findParent(parent[v], parent);
    }

    private static Edge[] kruskalAlgorithm(Edge[] edges, int n) {
        Arrays.sort(edges);
        Edge mst[] = new Edge[n - 1];
        int[] parent = new int[n];
        for (int j = 0; j < n; j++) {
            parent[j] = j;
        }

        int count = 1, i = 0;
        while (count != n - 1) {
            Edge currentEdge = edges[i++];
            int v1Parent = findParent(currentEdge.v1, parent);
            int v2Parent = findParent(currentEdge.v2, parent);
            if (v1Parent != v2Parent) {
                //including current edge
                mst[count] = currentEdge;
                count++;
                parent[v1Parent] = v2Parent; //update the parent
            }
        }
        return mst;
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int e = scn.nextInt();

        Edge edges[] = new Edge[e];
        for (int i = 0; i < e; i++) {
            int v1 = scn.nextInt();
            int v2 = scn.nextInt();
            int weight = scn.nextInt();
            Edge edge = new Edge(v1, v2, weight);
            edges[i] = edge;
        }

        Edge mst[] = kruskalAlgorithm(edges, n);
        for (int i = 0; i < mst.length; i++) {
            if (mst[i].v1 < mst[i].v2) {
                System.out.println(mst[i].v1 + mst[i].v2 + " " + mst[i].weight);
            } else {
                System.out.println(mst[i].v2 + mst[i].v1 + " " + mst[i].weight);
            }
        }

    }


}
