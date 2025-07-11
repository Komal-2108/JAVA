public class factorial {
    public static int calcFact(int n ){
        if(n==0){
            return 1 ;
        }
        int fnm1 = calcFact(n-1);
        int factn= n * fnm1 ; 
        return factn; 
    }
    public static void main(String args[]){
        System.out.println(calcFact(5));
    }

    
}
