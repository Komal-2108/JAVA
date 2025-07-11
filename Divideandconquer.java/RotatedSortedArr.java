public class RotatedSortedArr {
    public static int searchtarget(int arr[] , int target , int si , int ei ){

        //kaam 
        int mid = si +(ei-si)/2 ; 
        //Case Found 
        if(arr[mid]==target){
            return mid ; 
        }
        // mid on L1
        if(arr[si] <= arr[mid] ){
            //case a : left
            if(arr[si] <= target && target <= arr[mid]){
               return  searchtarget(arr,target , si , mid-1);
            }
            //case b : right
            else{
               return  searchtarget(arr,target, mid+1 , ei);
            }

        }
        //mid on L2
        else{
            // case c : right 
            if(arr[mid] <= target && target <= arr[ei]) {
                return searchtarget(arr, target , mid+1 , ei );
            }
            //case d : left 
            else{
                return searchtarget(arr,target, si , mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] ={4,5,6,7,0,1,2};
        int tarIdx=searchtarget(arr,0,0,arr.length-1);
        System.out.println(tarIdx);
    }
    
}
