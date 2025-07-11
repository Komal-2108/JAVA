public class SelectionSort {
    public static void SelectionSort(int arr[]){
        for(int turn = 0 ; turn <arr.length- 1 ; turn ++){
            int minposn = turn ;
            for(int j = turn + 1 ;  j<arr.length  ; j++){
                if(arr[minposn]< arr[j]){
                    minposn = j ;
                }
            }
            // swap
            int temp = arr[minposn]; 
            arr[minposn] = arr[turn];
            arr[turn] = temp ; 
        
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
        SelectionSort(arr);
        printarr(arr);
        

    }
    
}
