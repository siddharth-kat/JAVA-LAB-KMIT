/* Write a Java Program to perform the multiplication of two matrices

Sample IO 1
----------
Enter the number of rows & columns for the first matrix:                                                                
2 3                                                                                                                     
Enter the number of rows & columns for the second matrix:                                                               
3 2                                                                                                                     
Enter the elements of first matrix:                                                                                     
1 2 3 4 5 6                                                                                                             
Enter the elements of second matrix:                                                                                    
7 8 9 10 11 12                                                                                                          
Product of the matrices:                                                                                                
58 64                                                                                                                   
139 154                                                                                                                 

Sample IO 2
-----------
Enter the number of rows & columns for the first matrix:                                                                
3 2                                                                                                                     
Enter the number of rows & columns for the second matrix:                                                               
3 3                                                                                                                     
Matrices cannot be multiplied!                                                                                          
*/
import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows & columns for the first matrix:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the number of rows & columns for the second matrix:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(y==a){
            System.out.println("Enter the elements of first matrix:");
            int mat1[][]=new int[x][y];
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements of second matrix:");
            int mat2[][] = new int[a][b];
            
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    mat2[i][j]=sc.nextInt();
                }
            }
            
            int mul[][]=new int[x][b];
            
            for(int i=0;i<x;i++){
                for(int j=0;j<b;j++){
                    mul[i][j]=0;
                    for(int k=0;k<y;k++){
                        mul[i][j]=mul[i][j]+(mat1[i][k]*mat2[k][j]);
                    }
                }
            }
            System.out.println("Product of the matrices:");
            
            for(int i=0;i<x;i++){
                for(int j=0;j<b;j++){
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrices cannot be multiplied!");
        }
    }
}