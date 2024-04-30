/*
In a supermarket a customer comes to buy products. 
On basic amenities- the GST is 5% and on luxury amenities- 
the GST is 10%. Calculate the total bill and display. 
Create a Product class with instance variables name as String , 
price as double, type of product as character and bill of 
the product cost as double. Declare a constructor and initialize name,
price and type. Define a method calculateCost() which computes 
the total cost of each product, displayDetails() method which displays 
name, price and cost. Create a driver class ProductInfo, create 2 objects 
of Product by reading the appropriate input values, compute the cost of 
each product and display the details of each product.

Sample IO
---------
Enter name, price and type(b/l) of product1                                                                             
book                                                                                                                    
56                                                                                                                      
b                                                                                                                       
Enter name, price and type(b/l) of product2                                                                             
car                                                                                                                     
450000                                                                                                                  
l                                                                                                                       
Name of the Product :book                                                                                               
Price of the Product :56.0                                                                                              
Cost of the Product :58.8                                                                                               
Name of the Product :car                                                                                                
Price of the Product :450000.0                                                                                          
Cost of the Product :495000.0

*/
import java.util.*;
class Product{
    String name;
    double price;
    double cost;
    char type;
    
    Product(String name,double price, char type){
        this.name=name;
        this.price=price;
        this.type=type;
        cost=0;
    }
    void calculateCost(){
        if(type=='b'){
        cost=price+(price*5)/100;
        }
        else if(type=='l'){
            cost=price+(price*10)/100;
        }
    }
    void display(){
        System.out.println("Name of the Product: "+name);
        System.out.println("Price of the Product: "+price);
        System.out.println("Cost of the Product: "+cost);
    }
}
public class ProductInfo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, price and type(b/l) of product1");
        String a=sc.next();
        double b=sc.nextDouble();
        char c=sc.next().charAt(0);
        
        System.out.println("Enter name, price and type(b/l) of product2");
        String a1=sc.next();
        double b1=sc.nextDouble();
        char c1=sc.next().charAt(0);
        
        Product p1=new Product(a,b,c);
        p1.calculateCost();
        Product p2=new Product(a1,b1,c1);
        p2.calculateCost();
        p1.display();
        p2.display();
    }
}

