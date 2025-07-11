class Student {
    String name ;
    int age ; 
    void printInfo(){
        System.out.println("name  : "+ this.name );
        System.out.println("age : "+ this.age );
    }
    Student(Student s1){
        this.name = s1.name ;
        this.age = s1.age;
    }
    Student(){

    }

}
public class Copyconstructor{
        public static void main(String args[]){
            Student s1 = new Student();
            s1.name = "Komal";
            s1.age = 20;
            Student s2 = new Student(s1);
            s2.name = "Satyam";
            s2.age= 16;
            s2.printInfo();
            
        
    }
}
   