package Graphs;

public class Islands {

    public static int numConnected(int[][] edges, int n) {

        boolean[] vis = new boolean[n];
        int c = 0;
        for(int i=0;i<n;i++){
            if(vis[i] == false){
                dfs(edges,i,vis,n);
                c++;
            }
        }
        return c;
    }

    private static void dfs(int[][] edges, int v1, boolean[] vis, int n) {
        vis[v1]=true;
        for(int i=0;i<n;i++){
            if(vis[i]==false && edges[v1][i]==1){
                dfs(edges,i,vis,n);
            }
        }
    }
}
