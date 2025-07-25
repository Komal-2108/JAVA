import  java.util.*;
public class Stockspan {
    public static void stockSpan(int stock[] , int span[]){
        Stack<Integer>s = new Stack<>();
        span[0] = 1 ;
        s.push(0);
        for(int i = 1 ; i<stock.length ; i++){
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()] ){//yaha s.peek hme stack k top element dega mtlb index dega aur phir stocks [idx] hme milega.
                s.pop();
            }
            if(!s.isEmpty()){
                span[i] = i+1 ;
            }else{
                int prevhigh = s.peek();
                span[i] = i-prevhigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[] = { 100 , 80 , 60 , 70 , 60, 85 , 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);
        
        for(int i = 0 ; i<span.length ; i++){
            System.out.println(span[i]+ " ");
        }

    }
    
}
