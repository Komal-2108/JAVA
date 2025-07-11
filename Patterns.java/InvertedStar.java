import java.util.* ; 
public class InvertedStar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        for(int i = n ; i>=1 ; i--){
            for(int j = i ; j >=1 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }



        // OR 
        for(int i = 0 ;  i<= n-1 ; i++ ){//( outer loop prints numbers of line which is 4 in both cases normal and inverted pattern)
            for(int j = 1 ; j<= n-i ; j++ ){
                System.err.print("* ");
            }
            System.out.println();

        }
    }
    
}
