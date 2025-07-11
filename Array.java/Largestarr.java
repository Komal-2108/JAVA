public class Largestarr {

    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-INFINITY
        for (int i = 0 ; i<numbers.length ; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
        } 
        return largest ; 
    }
    public static void main(String args[]){
        int numbers[] = {51,269,789,78,295,458};
        System.out.println("largest value is : " + largest(numbers));

    }

   
    
}
