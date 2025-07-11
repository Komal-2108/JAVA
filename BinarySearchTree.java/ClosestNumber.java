public class ClosestNumber {
    public static void printClosest(int num[]){
        int closest = Integer.MAX_VALUE;
        for(int i = num[0] ; i<=num.length ;i++){
            if(Math.abs(i) < Math.abs(closest) || (Math.abs(i) == Math.abs(closest) && i>closest) ){
                closest = i ;
            }
        }
        System.out.println(closest);

    }
    public static void main(String args[]){
        int num[] = {5,8,1,2,-9,0 , -1};
        printClosest(num);

    }
}
