public class Tilingproblem {
    public static int tilingproblem(int n ){
        if (n== 0 || n==1 ){
            return 1 ;
        }
        int fn = tilingproblem(n-1) + tilingproblem(n-2);
        return fn ;
    }
    public static void main(String args[]){
        System.out.println(tilingproblem(8));
    }
    
}
