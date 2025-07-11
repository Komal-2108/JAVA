public class MaxSum_Array {
    public static void printSubArr(int arr[]){ 
        int curr_sum= 0 ;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            int start = i ; 
            for(int j = i+1 ; j<arr.length ; j++ ){
                int end = j ; 
                curr_sum= 0 ;
                for(int k = start ; k<=end ; k++){
                    curr_sum = curr_sum + arr[k]; 
                   
                }
                System.out.println(curr_sum);
                if(max_sum<curr_sum){
                    max_sum = curr_sum;
                }
                

               
            }
            
        }
        System.out.println(" max sum of subarray : " + max_sum);


    }
    public static void main(String args[]){
        int arr[] ={2 , 4 , 6, 8, 10 ,12};
        printSubArr(arr);
        
        
    }
    
}
