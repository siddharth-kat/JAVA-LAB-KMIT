/* Write a Java Program to find the sum of digits of a given positive integer 
and find whether the given number is a palindrome or not

Sample 1
--------
171
sum=9
171 is a palindrome

Sample 2
--------
253
sum=10
253 is not a palindrome

*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        
        int sum=0;
        
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        
        System.out.println("sum="+sum);
        
        String temp=Integer.toString(c);
        String comp="";
        for(int i=temp.length()-1;i>=0;i--){
            comp+=temp.charAt(i);
        }
        int y=Integer.parseInt(comp);
        
        if(y==c){
            
            System.out.println(c+" is a palindrome");
        }else{
            System.out.println(c+" is not a palindrome");
        }
        
    }
}