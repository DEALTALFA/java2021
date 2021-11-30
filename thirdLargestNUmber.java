import java.util.Arrays;
import java.util.Scanner;

public class thirdLargestNUmber{
    public static void main() {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of array");
    int a=sc.nextInt();
    int arr[a]={};
    for(int j=0;j<arr.length;j++){
       arr[j]=sc.nextInt(); 
    }
    Arrays.sort(arr);
    System.out.println("Third largest number in array is "+arr[arr.length-3]);
     
}   
}
