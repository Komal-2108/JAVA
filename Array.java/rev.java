import java.util.* ; 
public class rev {

    // public static void subarr(int numbers[]){ // max sub array sum 
    //     int maxval = 0 ; 
    //     int currval = 0 ; 
    //     for(int i = 0 ; i< numbers.length ; i++){
    //         for(int j = i ; j<numbers.length ; j++){
    //             currval = 0 ; 
    //             for(int k = i ; k<=j ; k++){
    //                 System.out.print(numbers[k] + " ");
    //                 currval += numbers[k];
    //             }
    //             System.out.println();
    //             if(maxval < currval){
    //                 maxval = currval ;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("max value of subarr : " + maxval );
    // }
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
                   if(currval < 0 ){
                    currval = 0 ; 
                   }
                   if(maxval< currval){
                    maxval = currval ;
                }

                }
                
            }
        
        System.out.println("MAX SUM OF SUBARRAY : " + maxval);
       
    }
    
    public static void main(String args[]){
        int numbers[]= {-2 ,-3 , 4 , -1 , -2 , 1 , 5 , -3};
        subarr(numbers);
        


    } 
}
