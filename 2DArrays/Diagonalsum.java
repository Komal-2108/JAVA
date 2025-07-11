public class Diagonalsum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0 ; // complexity : 0(n^2) // so not very optimized code 
        //pd
        for(int i = 0 ; i<matrix.length ;i++ ){
            for(int j= 0 ; j<matrix[0].length ; j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j == matrix.length -1 ){
                    sum+= matrix[i][j];
                }
            }
        }

        return sum ;
    }


    public static int diagonalSum2(int matrix[][]){ // complexity 0(n) // optimized code 
        int sum = 0 ;
        for(int i = 0 ; i<matrix.length ; i++){
            //pd
            sum+= matrix[i][i];
            //sd
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        return sum ; 
    }
    public static void main (String args[]){
        int matrix[][]= {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSum2(matrix));

    }
    
}
