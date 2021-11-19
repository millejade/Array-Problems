public class IslandPerimeter {

    public static void main(String[] args) {
        
        int[][] island = {{0,1,0,0},
                          {1,1,1,0},
                          {0,1,0,0},
                          {1,1,0,0}};
        
        System.out.println(getPerimeter(island));
    }

    public static int getPerimeter(int[][] land) {
        
        if(land == null) return 0;
        
        int perimeter = 0;
        
        for(int i = 0; i < land.length; i++){
        
            for(int j = 0; j < land[0].length; j++){ //land[0].length is the length of FIRST ROW or the number of columns
              
                //we will just search for 1s in the array/grid
                if(land[i][j] == 1){
                  
                    perimeter += countPerimeter(land, i, j);
                }
            }
        } 
        return perimeter;
    }
    
    //check if the each side of the grid with value of '1' is >>'0' or 'out of bounds'<<
    //sides are: top, bottom, left and side of the current grid
    //'0' or 'out of bounds' indicates that the current grid is surrounded of water...
    //...thus, we can increment the count of perimeter if it is water.
    public static int countPerimeter(int[][] land, int i, int j){
        int count = 0;
        
        //check left side of the current grid
        if(j - 1 < 0 || land[i][j - 1] == 0) count++; //j - 1 < 0 indicates out of bounds
        
        //check the right side
        if(j + 1 >= land[0].length || land[i][j + 1] == 0) count++; //j + 1 >= land[0].length indicates out of bounds
                                                                    //length of FIRST ROW or number of columns
        
        //check the top of the current grid
        if(i - 1 < 0 || land[i - 1][j] == 0) count++; //i - 1 < 0 indicates that the top of grid is out of bounds
        
        //check the bottom of the current grid
        if(i + 1 >= land.length || land[i + 1][j] == 0) count++; //i + 1 >= land.length indicates out of bounds
                                                                 //land.length is the NUMBER of ROWS
        return count;
    }
    
}
