/* Day 8
Wave Array 
 
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
Example 1:
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
Example 2:
Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in the waveform are 
4 2 8 7 10 9.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ n ≤ 106
0 ≤ arr[i] ≤107
*/
import java.util.Scanner;
public class wavearray {
    public static void waveArrayFind(int a[]){
		int i=0,temp;
		for(int j=i+1;j<a.length;j++){
			if(i%2==0){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			i++;
		}
		for(int wave: a){	
			System.out.print(wave + " ");
		}
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = input.nextInt();
		}
		waveArrayFind(arr);
	}
}
