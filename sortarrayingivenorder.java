/*Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.
 
Example 1:
Input:
N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:
7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd
and sorted in descending order,
whereas 2 4 10 are even numbers
and sorted in ascending order.
 
Example 2:
Input:
N = 7
Arr = {0, 4, 5, 3, 7, 2, 1}
Output:
7 5 3 1 0 2 4
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function leftIndex() which takes the array Arr[] and its size N as inputs and modifies the array Arr[].
 
Expected Time Complexity: O(N. Log(N))
Expected Auxiliary Space: O(N)
 
Constraints:
1 <= N <= 106
0 <= Ai <= 1018 */

import java.util.Scanner;
public class sortarrayingivenorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int arr[]= new int[sc.nextInt()];
        System.out.println("Enter the array element");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        sc.close();
        int finalArray[] = leftIndex(arr, arr.length);
    }
    private static int[] leftIndex(int []arr2,int N){
        int even=0,len=N,odd=0;
        for(int i=0;i<len;i++)
        if(arr2[i]%2==0)
        even++;
        else
        odd++;
        int arreven[]=new int[even],arrodd[]=new int[odd];
        even=0;odd=0;
        for(int i=0;i<arr2.length;i++)
        if(arr2[i]%2==0)
        arreven[even++]=arr2[i];
        else
        arrodd[odd++]=arr2[i];
        return arr2;
    } 
    
}
