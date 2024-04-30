/* Given an unsorted array arr[] of size N, Write a java program 
to rotate the given array by D elements (clockwise).

Sample input=
5  //size of array (N)
2  //D value
1 2 3 4 5  //Array elements
Sample output=
3 4 5 1 2

*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            ans[j]=arr[(j+d)%n];//=arr[j];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        
        
    }
}