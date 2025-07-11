import java.util.*;
public class OddEven{
    public static void bits(int n ){
        int BitMask = 1 ;
        if((n & BitMask) == 1 ){
            System.out.println("odd number");
        }
        else{
            System.out.println("even number ");
        }
    }
    public static void main(String args[]){
bits(10);
bits(7);
    }

}