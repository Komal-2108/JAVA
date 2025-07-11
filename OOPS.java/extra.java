class Car{
    String brand ; 
    int year ;
    // Car(){
        
    //     System.out.println("car brand "  );
    // }
    void displayinfo(){
        System.out.println("Car brand " + brand);
        System.out.println("year"+ year);
    }

}
public class extra {
    public static void main(String args[]){
        Car mycar = new Car();
        mycar.brand = "KS";
        mycar.year = 2024;
        System.out.println(mycar.brand );
        mycar.displayinfo();
        


    }
    
}
