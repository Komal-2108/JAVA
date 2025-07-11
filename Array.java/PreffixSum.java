public class PreffixSum {
    public static void subarr(int numbers[]){
        int maxval = 0 ; 
         int currval = 0 ;
         int preffix[] = new int [numbers.length];
         preffix[0] = numbers[0];
         
         for(int i = 1 ; i<preffix.length ; i++){
             preffix[i] = preffix[i-1] + numbers[i];
         }
         for(int i = 0 ; i<numbers.length ; i++){
            currval = i ;
             for(int j = i ; j<numbers.length ; j++ ){
 
                
                    currval = i == 0 ? preffix[j ] : preffix[j] - preffix[i-1];
                    if(maxval< currval){
                     maxval = currval ;
                 }
 
                 }
                 
             }
         
         System.out.println("MAX SUM OF SUBARRAY : " + maxval);
        
     }
     
     public static void main(String args[]){
         int numbers[]= {1 , -2 , 6 , -1 , 3};
         subarr(numbers);
         
 
 
     } 
 }
 

