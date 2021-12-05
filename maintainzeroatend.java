/* Day 7
Given an array arr[] of N positive integers. Push all the zero’s of the given array to the right end of the array while maintaining the order of non-zero elements.
 
Example 1:
Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.
 
Example 2:
Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.
 
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 
Constraints:
1 ≤ N ≤ 105
0 ≤ arri ≤ 105
*/

import java.util.Scanner;
public class maintainzeroatend {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int array[]= new int[size];
        System.out.println("Enter the Elements array");
        for(int i=0;i<size;i++)
        array[i]=sc.nextInt();
        rightmove(array);
        System.out.println("\nthe array :");
        for(int element: array)
        System.out.print("\t"+element);
        sc.close();
    }
    private static void rightmove(int []arr){
        int low=0,high=arr.length-1;
        while(low<high){
            if(arr[low]!=0)
            low++;
            else if(arr[high]==0)
            high--;
            else{
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        // System.out.println("Inside function array");
        // for(int element:arr)
        // System.out.print("\t"+element);
    }
}
