class Solution {
    public int numIslands(char[][] grid) {
        
        // make varaible to track count
        // loop through the grid
        // first loop will represent the outer array
        // second loop will do the inner array
        // increment if we encounter the number 1
        // search for others using DFS
        
        int count = 0;
        
        for (int i = 0; i < grid.length; i++){
            for (int j =0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return count;        
        
    }
    
    public void dfs(char[][] grid, int i, int j){
        
        if(i<0 || j<0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j+1);        
       
        
    }
}