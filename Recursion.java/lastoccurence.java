public class lastoccurence {
    public static int lastoccurence(int arr[] , int key , int i){
        if(i == arr.length){
            return -1 ; 
        }
         int isFound = lastoccurence(arr, key , i+1);
        if(isFound == -1 && arr[i]== key){
            return i;
        }

        return isFound; 
        

    }
    public static void main(String args[]){
        int arr[]= {2,4,6,7,6,8};
        System.out.println(lastoccurence(arr,6 , 0));
    }
    
}
