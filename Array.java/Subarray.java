public class Subarray {
    public static void printSubArr(int arr[]){ int ts = 0 ;
       
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++ ){
                for(int k = i ; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                   
                }
                ts++;
                

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Number of total SubArrays : " + ts );


    }
    public static void main(String args[]){
        int arr[] ={2 , 4 , 6, 8, 10 ,12};
        printSubArr(arr);
        
        
    }
}
