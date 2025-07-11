class Pen{
    String color ;
    String type ;

    void write(){
        System.out.println("Write Something......");
    }
    void printInfo(){
        System.out.println("color of pen  is " + this.color);
        System.out.println("type of pen is :" +this.type);
    }

}
class Student{
    String name ;
    int age ; 

    void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){ // non parametrized constructor 
        System.out.println("constructor called..");
    }
    Student(String naam , int umar){//parametrized constructor 
        this.name = naam ; //this.name(indicates object that specify after class) = name(parameter)
        this.age = umar ; 

    }
    
}

public class Oopsfile {
    public static void main(String args[]){
    
    // Pen p1 = new Pen();
    // p1.color = "Blue";
    // p1.type = "Gel";

    // Pen p2 = new Pen();
    // p2.color = "Black";
    // p2.type = "BallPoint";

    // p1.printInfo();
    // p2.printInfo();

    Student s1 = new Student("komal" , 20); // agr hm parametrized constructor bnate h non parametrized constructor ko call nhi lgta
        // s1.name = "Komal";
        // s1.age = 20;
        s1.print(); // print function ko call lga jisme this.name = naam hai aur this.age = umar h 

    
    }
    
}
