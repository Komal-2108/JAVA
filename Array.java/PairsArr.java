public class PairsArr {
    public static void printpairs(int numbers[]){ 
        int tp = 0 ;
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i+1 ; j<numbers.length ; j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                tp++ ; 

            }
            System.out.println();
           
        }
        System.out.println("Total pairs are : " + tp);
    }
    public static void main(String args[]){
        int numbers[] = {2 , 4 , 6 , 8 , 10};
        printpairs(numbers);

    }
    
}
