// loop through the arrays
// for outer array of columns
//      for inner array of cells within column
//              if we find an X
//              then we need to mark found by incrementing answer count
//              then look at adjacent cells to see if we can find a battleship part

class Solution {
    public int countBattleships(char[][] board) {
        
        int numShips = 0;
        
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X'){
                    numShips++;
                    dfs(board, i, j);
                }
                
            }
        }
        
        return numShips;
        
    }
    
    public void dfs(char[][] board, int i, int j){
        // edge cases - we must be processing a ship, and we must still be ON the playing surface
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'X'){
            return;
        }
        
        // mark node as visited in our graph
        board[i][j] = '.';
        
        // check in all four directions where ship could possibly be
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
}