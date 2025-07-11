public class Firstoccurence {
    public static int firstoccurence(int arr[] , int key , int i ){
        if(i== arr.length){
            System.out.println("key not found . ");
            return -1;
        }
        if(arr[i]== key){
            return i ; 
        }
      return   firstoccurence(arr , key , i+1);


    }
    public static void main (String args[]){
        int arr[]= { 8 , 5,2,6,7,2,8,5,};
        System.out.println(firstoccurence(arr,11,0));
    }
    
}
