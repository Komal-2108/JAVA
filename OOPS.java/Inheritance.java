import java.util.*;
// import bank;
class Shape{
    void area (){
        System.out.println("shows area");
    }
}
class Triangle extends Shape{
    void area (int l , int h ){
        System.out.println(1/2 * l*h);
    }
}
class EquilateralTriangle extends Triangle{
    void area (int l , int h ){
        System.out.println(1/2 * l*h);
    }
}
class Circle extends Shape{
    void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Inheritance {
    public static void main(String args[]){
        
    }

 
}