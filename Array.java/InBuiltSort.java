import java.util.Arrays ; 
public class InBuiltSort {
    public static void main(String args[]){
        int arr[] = {7 , 6 , 1 , 5 , 4 , 3 ,2};
        // Arrays.sort(arr);
        Arrays.sort(arr , 0 , 5);

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    
}
