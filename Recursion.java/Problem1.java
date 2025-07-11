public class Problem1 {
    public static void nto1(int n ){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        nto1(n-1);
        
    }
    public static void main(String args[]){
        nto1(10);
    }
    
}
