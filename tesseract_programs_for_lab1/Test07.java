/*
Given an array of values find the second maximum and second minimum
elements in the array.

Sample IO
---------
Enter the size of the array
10
Enter array elements
3 1 2 7 6 5 4 0 9 8
Second maximum=8
Second minimum=1

*/
import java.util.*;
class Solution{
    void ans(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int x=sc.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second maximum="+arr[x-2]);
        System.out.println("Second minimum="+arr[1]);
    }
}

public class Test{
    public static void main(String args[]){
        Solution s1=new Solution();
        s1.ans();
    }
}
