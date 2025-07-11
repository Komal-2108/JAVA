public class BubbleSort {

    public static void BubbleSort(int arr[]){
        for( int turn = 0 ; turn< arr.length ; turn++){
            int swap = 0 ; 

            for(int j = 0 ; j<arr.length - 1 - turn ; j++){
                
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;  
                    swap++ ;
                    
                }
               
            }
            System.out.println("no. of swap : " + swap);
            
        }
       
    }

    public static void printarr(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {7 , 6 , 1 , 5 , 4 , 3 ,2};
        BubbleSort(arr);
        printarr(arr);
        

    }
    
}
