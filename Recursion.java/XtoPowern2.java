// public class XtoPowern2 {
//     public static int optimizedpower(int x , int n){
//         if(n==0 ){
//             return 1 ; 
//         }
//         int half = optimizedpower(x , n/2);
//        int halfsq =  half * half ;
//        if(n%2 != 0 ){
//         halfsq= x* halfsq ; 
//        }
//        return halfsq ; 

//     }
//     public static void main(String args[]){
//         System.out.println(optimizedpower(2,101));
//     }

// }
import java.math.BigInteger;

public class XtoPowern2 {
    public static BigInteger optimizedpower(int x , int n) {
        if (n == 0) {
            return BigInteger.ONE; 
        }
        BigInteger half = optimizedpower(x, n / 2);
        BigInteger halfsq = half.multiply(half);
        if (n % 2 != 0) {
            halfsq = BigInteger.valueOf(x).multiply(halfsq); 
        }
        return halfsq; 
    }

    public static void main(String args[]) {
        System.out.println(optimizedpower(2, 101));
    }
}
