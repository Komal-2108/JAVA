public class clearBit {
    public static int clearbit(int n , int i ){
        int Bitmask = ~(1<<i);
        int value = (n & Bitmask );
        return value ;
    }
    public static void main (String args[]){
        System.out.println(clearbit(10 , 1));
        //love u mumma papa . 
        

    }
    
}
