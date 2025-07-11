public class SetBit {
    public static int setbit(int n , int i ){
        int bitmask = 1<<  i ;
       n = (n|bitmask);
       return n ;
    }
    public static void main(String args[]){
        System.out.println(setbit(10 , 2 ));
        
    }
    
}
