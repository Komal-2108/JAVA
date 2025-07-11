import java.util.*;

public class SubarraySumK {
    public static int subarraySumK(int arr[] , int k){
        HashMap<Integer , Integer> map = new HashMap<>();

        //(sum,count)
        map.put(0,1);
        int sum = 0 ; 
        int freq = 0;

        for(int j = 0 ; j<arr.length ; j++){
            sum += arr[j] ;
            if(map.containsKey(sum -k)){
               freq += map.get(sum-k) ;

            }else{
                map.put(sum,map.getOrDefault(sum, 0) + 1 );
            }
        }
        return freq;
    }
    public static void main(String args[]){
        int arr[] = {10,2,-2,-20,10};
        
        System.out.println("Largest Subarray with sum as 0  : " + subarraySumK(arr,-10));

    }
    
}
