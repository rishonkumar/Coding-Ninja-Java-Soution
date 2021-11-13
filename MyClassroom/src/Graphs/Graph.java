package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

    public static void dfTraversal(int[][] adjMatrix, int currentVertex, boolean visited[]) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1 && visited[i] == false) { //if it is adjaceny and not visied then
                // explore
                // i is neighbor of currentIndex
                dfTraversal(adjMatrix, i, visited); //explore the currentIndex
            }
        }
    }

    public static void dfTraversal(int[][] adjMatrix) {

        boolean visited[] = new boolean[adjMatrix.length];
        for(int i=0 ; i< adjMatrix.length ; i++){ // for disconnected graph
            if(!visited[i]){
                dfTraversal(adjMatrix, 0, visited); //source will be my currentVertex for first time
                System.out.println();
            }
        }

    }


    public static void bfTraversal(int[][] adjMatrix) {

        Queue<Integer>pendingVertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingVertices.add(0);

        while(!pendingVertices.isEmpty()){
            int currentVertices = pendingVertices.poll();
            System.out.print(currentVertices + " ");
            //explore all unvisited negibors of currentVeritces
            for(int i=0 ; i< adjMatrix.length ; i++){
                if(adjMatrix[currentVertices][i]==1 && !visited[i]){
                    // i is unvisited neigbor of currentVertex
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int e = scn.nextInt();
        int[][] adjMatrix = new int[n][n];

        for (int i = 0; i < e; i++) {
            int v1 = scn.nextInt(); //1st vertices
            int v2 = scn.nextInt(); //2nd vertices
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1; //connected adjacent are marked 1
        }
        dfTraversal(adjMatrix);

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(adjMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
