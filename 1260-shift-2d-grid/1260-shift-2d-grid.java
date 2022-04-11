class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        
        
        for(int times = 0; times < k; times++){
            int previous = grid[grid.length - 1][grid[0].length - 1];

            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    int temp = grid[row][col];
                    grid[row][col] = previous;
                    previous = temp;
                }
            }           
        }
        
        
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            result.add(listRow);
            for (int v : row) listRow.add(v);
        }

        return result;           
    }
}