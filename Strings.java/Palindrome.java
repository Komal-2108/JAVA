import java.util.*;
class palindrome{
    public static boolean palindrome(String str ){
        int n = str.length();
        for(int i = 0 ; i<n/2 ; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false ; 
            }
        }
        return true ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to check is it palindrome or not : ");
        String str = sc.nextLine();
        if(palindrome(str)){
            System.out.println("Yes! It is palindromic String  . ");
        }else{
            System.out.println("Sorry ! It is not a Palindromic String");
        }

        

    }
}