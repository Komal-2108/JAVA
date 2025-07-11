import java.util.*;
public class matrices {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the no.of rows" );
        int n = sc.nextInt();
        System.out.print("Enter the no.of column" );
        int m = sc.nextInt();
        int matrix[][] = new int [n][m];
        //input
        System.out.println("enter the entries of matrices:");
        for(int i  = 0 ; i< n ; i++){
            for(int j = 0 ; j<m ; j++){
               System.out.print("Enter the value of " + "(" + i + "," + j + ") term :");


                matrix[i][j] = sc.nextInt();

            }

        }
        //output
        for(int i = 0 ; i <n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j] +" " );
            }
            System.out.println();
        }



    }
    
}
