import java.util.* ;

public class BASICS {
    public static void main(String args[]){
     int marks[]= new int[6];
     System.out.println(marks.length);
     Scanner sc = new Scanner (System.in);
     marks[0]=sc.nextInt();
     marks[1]=sc.nextInt();
     marks[2]=sc.nextInt();

     System.out.println("PHYSICS marks is : "+ marks[0]);
     System.out.println("CHEMISTRY marks is : "+ marks[1]);
     System.out.println("MATHS marks is : "+ marks[2]);
     System.out.println("PERCENTAGE =  "+ (marks[0]+ marks[1]+ marks[2])/ 3 + "%");

    }
}
