public class Solution {
    //linear time
    public int islandPerimeter(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    count+= (4 - checkSides(grid, i, j));
                }
            }
        }

        return count;
    }

    //for each 1, we add the number of sides that are not covered
    //this function returns the number of sides that are covered
    public int checkSides(int[][] grid, int i, int j){
        int count = 0;

        if((i + 1) < grid.length){
            if(grid[i + 1][j] == 1){
                count++;
            }
        }

        if((i - 1) > -1){
            if(grid[i -1][j] == 1){
                count++;
            }
        }

        if((j + 1) < grid[0].length){
            if(grid[i][j + 1] == 1){
                count++;
            }
        }

        if((j - 1) > -1){
            if(grid[i][j - 1] == 1){
                count++;
            }
        }

        return count;
    }
}
