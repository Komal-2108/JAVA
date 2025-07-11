public class powerofTwo {
    public static boolean powerOfTwo(int n ){
        return (((n-1) & n )== 0 );
    }
    public static void main (String args[]){
        System.out.println(powerOfTwo(16));

    }
    
}
