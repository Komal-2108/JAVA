public class XtopowerN {
    public static int power(int x,int n ){
        if(n==0){
            return 1 ; 
        }
        int xnm1 = power(x,n-1);
        int xn = x* xnm1 ; 
        return xn ; 

    } 
    //or
    public static int power2(int x,int n ){
        if(n==0){
            return 1 ; 
        }
       return x * power(x , n-1);

    }
    public static void main(String args[]){
        System.out.println(power(2,3));
        System.out.println(power2(5,4));
 
    }
    
}
