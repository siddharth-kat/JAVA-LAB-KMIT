/* Write a java program to display the n terms of fibonacci series 

Sample:
-------
8
0 1 1 2 3 5 8 13

*/
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a=0;
        int b=1;
        int c=0;
        while(n>0){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}
