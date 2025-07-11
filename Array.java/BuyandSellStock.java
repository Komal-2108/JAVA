import java.util.*;
public class BuyandSellStock{
    public static int Stock(int prices[]){
        int BP = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i <prices.length ; i++){
            if(BP <prices[i]){
                int Profit = prices[i]-BP;
                maxProfit = Math.max(maxProfit , Profit );
            }else{
                BP = prices[i];
            }
        }
        return maxProfit ;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit of Stock : " + Stock(prices));
    }

}