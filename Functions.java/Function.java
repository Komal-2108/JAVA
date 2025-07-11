import java.util.*;
public class Function {
   public static int product(int a , int b ){
    return a*b ; 
   }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Product of 2 number : " + product(num1 , num2 ));

    }
    
}

