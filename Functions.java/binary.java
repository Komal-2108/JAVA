public class binary {
    public static void biToDec(int n ){
     int pow = 0 ;
     int n1 = n ;
     int dec = 0 ;
     while(n>0){
        int LD = n%10 ;
        dec = dec + (LD * (int)Math.pow(2, pow));
        pow++ ;
        n =  n / 10 ;

     }
     System.out.println("decimal of " + n1 + " = " + dec );
    }
    public static void main(String args[]){
        biToDec(101);
    }
    
}
