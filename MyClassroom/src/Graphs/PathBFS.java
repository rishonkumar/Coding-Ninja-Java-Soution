package Graphs;

import java.util.*;

public class PathBFS {

    public static ArrayList<Integer> getPathBFS(int adjMatrix[][], int s, int e) {
        Queue<Integer> pendingVertices = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[s] = true; //soure will be true
        pendingVertices.add(s); //push the source
        map.put(s, -1); //source will be -1 initally

        boolean pathFound = false;
        while (!pendingVertices.isEmpty()) {
            int currentVertices = pendingVertices.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertices][i] == 1 && !visited[i]) {
                    pendingVertices.add(i);
                    visited[i] = true;
                    map.put(i, currentVertices);
                    if (i == e) {
                        //path found
                        pathFound = true;
                        break;
                    }
                }
            }
        }
        if (pathFound) {
            ArrayList<Integer> path = new ArrayList<>();
            int currentVertex = e;
            while (currentVertex != -1) {
                path.add(currentVertex);
                int parent = map.get(currentVertex);
                currentVertex = parent;
            }
            return path;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][] = new int[V][V];
        for (int i = 0; i < E; i++) {
            int sv = s.nextInt();
            int ev = s.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        int V1 = s.nextInt();
        int V2 = s.nextInt();
        ArrayList<Integer> path = getPathBFS(edges, V1, V2);
        for (Integer i : path) {
            System.out.print(i + " ");
        }
    }
}
