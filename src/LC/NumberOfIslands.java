package LC;

/*
 @author Myvin Barboza
 17/04/20 5:48 PM 
 */public class NumberOfIslands {

   static int numIslands(char[][] grid) {
        int sum=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                if(grid[i][j]==1){
                    sum=sum+1;
                    dp(grid,i,j);
                }
            }
        }
        return sum;
    }

    static void dp(char[][] grid,int i,int j){
        if(i<0) return;
        if(j<0) return;
        if(i>=grid.length)return;
        if(j>=grid[i].length)return;
        if(grid[i][j]==0)return;
        grid[i][j]=0;
        dp(grid,i+1,j);
        dp(grid,i-1,j);
        dp(grid,i,j+1);
        dp(grid,i,j-1);

    }


     public static void main(String[] args) {
         char mat[][]={
                 {1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}
         };
         System.out.println(numIslands(mat));
    }
}