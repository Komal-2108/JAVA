import java.util.*;
public class ReverseStack {
    public static void pushBottom(Stack<Integer>s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s , data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s,top);
        
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println();
        return ;
    }
    public static void main(String args[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s); // upr me print krne se reverse wla isliye print nhi ho rha h qki stack already empty ho chuka h as usse saare elements nikl chuke h to kya hi reverse krega aur ky hi print krega isliye sirf niche me print statement aayega .
        reverseStack(s);
        printStack(s);
    }
    
}
