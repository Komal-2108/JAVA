//compile Time (Method OverLoading)
class Student {
    String name ;
    int age ; 
    void printInfo(String name ){
        System.out.println("Name :" + this.name);
    }
    void printInfo(int age  ){
        System.out.println("Age :" + this.age);
    }
    void printInfo(String name , int age  ){
        System.out.println("Name :" + this.name +" ,  Age : "+ this.age  );
    }

}
public class Polymorphism {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Komal";
        s1.age= 20;
        s1.printInfo(s1.name , s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
    }   
}
