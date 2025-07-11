public class KadanesSum {
    public static void kadanes(int numbers[]){
        int currval = 0 ;
        int maxval = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            currval +=numbers[i];
            if(currval<0){
                currval = 0 ;
            }
            maxval = Math.max(currval , maxval);// if currval>maxval then maxval = currval , otherwise maxval is remain unchange. 
        }
        System.out.println(maxval);
    }
    public static void main (String args[]){
        int numbers[] = {-2 ,-3 , 4 , -1 , -2 , 1 , 5 , -3};
        kadanes(numbers);
    }
    
}
