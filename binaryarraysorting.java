/* DAY 3
Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.
Example 1:
Input:
N = 5
A[] = {1,0,1,1,0}
Output: 0 0 1 1 1
 
Example 2:
Input:
N = 10
A[] = {1,0,1,1,1,1,1,0,0,0}
Output: 0 0 0 0 1 1 1 1 1 1
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Challenge: Try doing it in one pass.
Constraints:
1 <= N <= 106
0 <= A[i] <= 1
*/
import java.util.Scanner;
public class binaryarraysorting{
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter arrays");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        arr=binsort(arr);
        for(int element: arr)
        System.out.print("\t"+element);
        sc.close();



    }
    private static int[] binsort(int []arr){
        int arr2[]=new  int[arr.length];
        int b_zero=0,b_one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            b_zero++;
            else if(arr[i]==1)
            b_one++;
        }
        for(int i=0;i<b_zero;i++)
        arr2[i]=0;
        for(int i=b_zero;i<arr.length;i++)
        arr2[i]=1;
        return arr2;
        /* @2nd solution
        int low=0,high=arr.length-1;
        while(low<high){
            if(arr[low]==0)
            low++;
            else if(arr[high]==1)
            high--;
            else{
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        */
    }
}