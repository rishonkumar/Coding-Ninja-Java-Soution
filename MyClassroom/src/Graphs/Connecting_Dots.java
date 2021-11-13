package Graphs;

import java.util.Arrays;

public class Connecting_Dots {

    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    int[][] visited;
    int cycle=0;

    int solve(String[] board , int n, int m)
    {
        visited = new int[n][m];
        for(int i=0 ; i<n;i++){
            Arrays.fill(visited[i],0);
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++)
                dfs(board,i,j,-1,-1,board[i].charAt(j),n,m);
        }
        return cycle;
    }

    private void dfs(String[] board, int x, int y, int fromX, int fromY, char needColor, int n, int m) {
        if(x<0 || x>=n || y<0 || y>=m)
            return;
        if(board[x].charAt(y)!=needColor) return;
        if(visited[x][y]==1){
            cycle=1;
            return;
        }
        visited[x][y]=1;
        for(int f=0;f<4;f++){
            int nX = x + dx[f];
            int nY = y + dy[f];
            if(nX == fromX && nY == fromY) continue;
            dfs(board,nX,nY,x,y,needColor,n,m);
        }
    }
}
