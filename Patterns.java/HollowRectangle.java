import java.util.*;
public class HollowRectangle {
    public static void hollowRectangle(int totRows , int totCols){
        for(int i = 1 ; i<=totRows; i++){
            for(int j = 1 ; j<=totCols ;j++ ){
                if( i==1 ||j== 1 || i== totRows ||j== totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int x = sc.nextInt();
        System.out.print("Enter numer of Columns :");
       
        int y = sc.nextInt();
        hollowRectangle(x, y);

       
    }
    
}
