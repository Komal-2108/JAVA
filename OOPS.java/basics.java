public class basics {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "yellow";
        System.out.println(p1.color);
        Student s1 = new Student("komal");
        System.out.println(s1.name);
    }
    
}
class Pen{
    String color = "red";
    int price;
     
    // void changecolor(String newcolor){
    //     color = newcolor ;
    // }
    void changeprice(int newprice){
        price = newprice;
    }
}
class Student{
    String name ;
    int rollno;
    Student(String name){
        this.name = name ;
        System.out.println("constructor is called......");
    }
}