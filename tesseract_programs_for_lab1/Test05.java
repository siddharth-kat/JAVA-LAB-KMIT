/*
Tata dealership company wants to keep track of their cars information. 
Creat a class called Car that contains instance data which represents the brand, 
model, and year of the car. Define the Car constructor to initialize these 
values and a method displayDetails() to print all the details of the car. 
Create a driver class called CarTest, whose main method instantiates 
2 Car objects and displays their information.

Sample IO 1
-----------
Enter brand, model, manufacturing year of car1                                                                          
suzuki                                                                                                                  
Brezza                                                                                                                  
2021                                                                                                                    
Enter brand, model, manufacturing year of car2                                                                          
toyota                                                                                                                  
innova                                                                                                                  
2023                                                                                                                    
The details of car1 are                                                                                                 
Brand: suzuki                                                                                                           
Model: Brezza                                                                                                           
Year: 2021                                                                                                              
The details of car2 are                                                                                                 
Brand: toyota                                                                                                           
Model: innova                                                                                                           
Year: 2023
*/
import java.util.Scanner;
class Car{
    String brand;
    String model;
    int manu;
    
    //constructor.
    Car(String brand,String model,int manu){
        this.brand=brand;
        this.model=model;
        this.manu=manu;
    }
    
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+manu);
    }
    
}
public class Test05{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter brand, model, manufacturing year of car1");
            String b=sc.next();
            String m=sc.next();
            int y=sc.nextInt();
            System.out.println("Enter brand, model, manufacturing year of car2");
            String b1=sc.next();
            String m1=sc.next();
            int y1=sc.nextInt();
        
            Car c1=new Car(b,m,y);
            Car c2=new Car(b1,m1,y1);
            
            System.out.println("The details of car1 are");
            c1.display();
            System.out.println("The details of car2 are");
            c2.display();
    }
}