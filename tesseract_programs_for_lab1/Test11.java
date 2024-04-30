/* Write a Java Program to perform the addition of two matrices

Sample IO
----------
Enter the number of rows and columns for the matrices:                                                                  
3 2                                                                                                                     
Enter the elements of first matrix:                                                                                     
1 2 3 4 5 6                                                                                                             
Enter the elements of second matrix:                                                                                    
8 10 4 12 17 15                                                                                                         
Sum of the matrices:                                                                                                    
9 12                                                                                                                    
7 16                                                                                                                    
22 21
*/
import java.util.Scanner;
class Solution{
    void ans(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrices:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the elements of first matrix:");
        int mat1[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        int mat2[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Test{
    public static void main(String args[]){
        Solution s1=new Solution();
        s1.ans();
    }
}