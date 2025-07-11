public class Problem2 {
    public static void oneTon(int n, int i  ){
        
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        oneTon(n,i+1);
        i+=1;

       
    }
    // 2nd method to print 1 to n (increasing order)
    public static void printInc(int n ){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        oneTon(10,1);
    }

}
