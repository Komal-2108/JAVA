public class Binarysearch {
    public static int binarysearch(int numbers[] , int key){
        int start = 0 ; int end = numbers.length - 1  ; 
        int mid = (start + end ) / 2 ; 
       while(start<=end){
       
         // comparisons 
         if(numbers[mid] == key ){
            return mid ; 
         }
         if(numbers[mid]>key){
            end = mid - 1 ; 

         } else{
            start= mid+1 ; 
         }
    
         
       }
       return -1;
    }

    public static void main(String args[]){
        int numbers[] = {98 , 65, 89 , 45 , 73};
        int key = 89 ; 
        System.out.println("key is at index : " + binarysearch(numbers , key));

    }

    
    
}
