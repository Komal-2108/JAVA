public class Sudoku {
    public static boolean isSafe(int sudoku[][] , int row , int col , int digit ){
        //column
        for(int i=0 ; i<9 ;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j = 0 ; j<9 ;j++){
            if(sudoku[row][j]==digit){
                return false ;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3x3 grid 
        for(int i=sr ; i< sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if(sudoku[i][j] == digit){
                    return false ;
                }
            }
        }
        return true ;
}
    public static boolean sudokuSolver(int sudoku[][] , int row , int col){
        //base case 
        if(row==9 ){
            return true;
        }
        //recursion
        int nextrow = row ;
         int nextcol = col+1 ; 
         if(nextcol== 9){
            nextrow = row+1;
            nextcol = 0 ; 
         }
         if(sudoku[row][col]!= 0 ){//soln exist
            return sudokuSolver(sudoku , nextrow , nextcol);

         }
         for(int digit = 1 ; digit<=9 ; digit ++){
            if(isSafe(sudoku , row , col , digit)){
                sudoku[row][col]= digit ; 
                if(sudokuSolver(sudoku, row , col)){
                    return true;
                }
                sudoku[row][col] = 0 ; 

            }
         }
         return false ; 
    }
    public static void printSudoku(int sudoku[][]){
        for(int i = 0 ; i<9; i++){
            for(int j = 0 ; j<9 ; j++){
                System.out.print(sudoku[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int sudoku[][] = {{0, 0, 0, 0, 9, 2, 0, 0, 0},
                          {0, 0, 1, 0, 7, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 3, 0, 0, 0},
                          {0, 0, 8, 0, 0, 0, 9, 0, 0},
                          {1, 7, 0, 0, 0, 6, 3, 0, 0},
                          {0, 0, 0, 3, 0, 0, 8, 0, 0},
                          {4, 0, 2, 6, 0, 0, 0, 9, 0},
                          {0, 8, 0, 7, 0, 4, 2, 3, 0},
                          {3, 0, 0, 0, 0, 8, 6, 4, 0}};

        if(sudokuSolver(sudoku , 0, 0)){
            System.out.println("Solution exist");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution does not exist ");
        }
    }
    
}


