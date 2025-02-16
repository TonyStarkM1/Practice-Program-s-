import java.util.Arrays;
public class ArrayEvenElementSum {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("Even Element Sum of "+ Arrays.toString(arr) +" is : "+sum);
    }
}
