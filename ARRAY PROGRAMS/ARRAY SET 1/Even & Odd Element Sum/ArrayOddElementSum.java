import java.util.Arrays;
public class ArrayOddElementSum {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("Odd Element Sum of "+ Arrays.toString(arr) +" is : "+sum);
    }    
}
