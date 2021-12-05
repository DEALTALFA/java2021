/*  Day 1
You are given an integer N. You need to convert all zeroes of N to 5.
Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
the number will be "1554".
 
Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)
Constraints:
1 <= n <= 10000
*/
import java.util.Scanner;
public class replace0with5 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,number=0;
        while(n>0){
            rem=n%10;
            n/=10;
            if(rem==0)
            rem=5;
            number=number*10+rem;
        }
        while(number>0){
            rem=number%10;
            number/=10;
            n=n*10+rem;
        }
    System.out.println(n);
        sc.close();
    }
}
