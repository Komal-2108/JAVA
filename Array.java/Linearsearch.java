public class Linearsearch {
    public static int linearsearch(int numbers[] , int key){
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i]== key){
                return i ;
            }
        }
        return 0 ;
    }
    public static void main(String args[]){
        int numbers[] = {56,26,78,45,29,37,49,82,46,35};
        int key = 29 ; 
        int index = linearsearch(numbers , key);
        if(index== 0){
            System.out.println("not found");
        }else{
            System.out.println("key is at index : " + index);
        }


    }
}
