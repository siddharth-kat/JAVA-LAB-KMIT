/*Write a Java program to check whether a given positive number is a 
Harshad Number or not.

Description : 
A harshad number in a given number base, is an integer that is divisible by the 
sum of its digits when written in that base.
Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 
is 2(2+0+0) and 200 is divisible by 2. 
Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 
is 9(1+7+1) and 171 is divisible by 9.

Harshad Number is also called as Niven Number.

Sample 1
--------
input=200
output=200 is harshad number

Sample 2
---------
input=101
output=101 is not harshad number

*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("input=");
        int n=sc.nextInt();
        int c=n;
        int sum=0;
        
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        if(c%sum==0){
            System.out.println("output="+c+" is harshad number");
        }
        else{
            System.out.println("output="+c+" is not harshad number");
        }
    }
}
