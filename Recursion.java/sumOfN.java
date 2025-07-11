public class sumOfN {
    public static int sum (int n ){
        if(n==0){
            return 0; 

        }
        int sumnm1= sum(n-1);
        int sumn = n + sumnm1;
        return sumn ; 
        
    }
    public static void main(String args[]){
        System.out.println(sum(5));
    }
    
}
