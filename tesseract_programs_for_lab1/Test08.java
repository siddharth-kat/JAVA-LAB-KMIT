/*
Given an array of values find the maximum and minimum
elements in the array.

Sample IO
---------
Enter the size of the array
10
Enter array elements
3 1 2 7 6 5 4 0 9 8
Maximum=9
Minimum=0

*/

import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Maximum="+a[n-1]);
        System.out.println("Minimum="+a[0]);
    }
}
