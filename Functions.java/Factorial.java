import java.util.*;
public class Factorial {

    public static int factorial(int n ){
        int fact = 1 ;
        for(int i = n ; i>= 1 ;i--){
            fact= fact * i ;
            
        }
        return fact ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");


        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");

         int r = sc.nextInt();
         int n_fact= factorial(n);
         int r_fact= factorial(r);
         int nMINr_fact= factorial(n-r);
         int BC = n_fact/(r_fact * nMINr_fact);
         System.out.println("BINOMIAL COEFFICIENT of (n,r) is : " + BC );




         

       
    }

    
}
