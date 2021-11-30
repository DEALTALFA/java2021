/*Third largest element 

Given an array of distinct elements. Find the third largest element in it.
Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
Example 1:
Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
 
Example 2:
Input:
N = 2
A[] = {10,2}
Output: -1
Your Task:
Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and returns the third largest element in the array. It returns -1 if there are less than 3 elements in the given array.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105
*/
import java.util.Arrays;
import java.util.Scanner;

public class thirdLargestNUmber{
    public static void main(String []args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of array");
    int a=sc.nextInt();
    int arr[]= new int[a];
    for(int j=0;j<arr.length;j++){
       arr[j]=sc.nextInt(); 
    }
    Arrays.sort(arr);
    try {
        System.out.println("Third largest number in array is "+arr[arr.length-3]);

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("-1");
    }
    
     sc.close();
}   
}
