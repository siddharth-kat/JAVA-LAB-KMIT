/* Write a Java program that takes a number and returns one digit 
that is the result of summing all the digits of the input number. 
When the sum of the digits consists of more than one digit, 
repeat summing until you get one digit.

Sample 1
---------
8887774   //number
4           //output: sum of digits until it become one digit

*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        
        while(n>9){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            n=sum;
        }
        System.out.println(n);
        
    }
}