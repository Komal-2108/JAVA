public class InsertionSort {
    public static void InsertionSort(int arr[]){
        for(int i = 1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct posn to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;

        }
    }
    public static void printarr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,1,2};
        InsertionSort(arr);
        printarr(arr);
    } //O(n^2)
    
}
