import java.util.*;
public class primeno {
    public static boolean prime(int n ){
        boolean Prime = true ;
        for(int i = 2; i<n-1 ; i++){
            if(n%i==0){
               return false ; 
            }
           
        }
        return true;
    }

    public static void primeInRange(int n ){
        for(int i = 2 ; i<=n ; i++){
            if(prime(i) ){
                System.out.println(i);
            }

        }
    }


    public static void main(String args[]){
       primeInRange(50);

    }
    
}
