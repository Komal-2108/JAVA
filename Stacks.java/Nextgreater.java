import java.util.*;
public class Nextgreater {
    public static void main(String args[]){
        int arr[] = {6 , 8 , 0,1,3}; // 0(n)
        Stack<Integer>s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
             s.push(i);
        }
        for(int i = 0 ; i<nxtGreater.length ; i++){
            System.out.print(nxtGreater[i] + " ,");
        }
    }
    //next greater right
    //next greater left --> for loop ko 0 se n tk kr dena h bs 
    //next smaller right -->stack se greatest element ko pop krte jao 
    //next smaller left --> loop se 0 se n tk jaayega aur greatest element pop hoga 
    
}
