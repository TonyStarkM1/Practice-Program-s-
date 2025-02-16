import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum=0;
        for(int j=0;j<=arr.length-1;j++)
        {
            sum+=arr[j];
        }
        System.out.println("The sum of Array "+ Arrays.toString(arr)+" is: "+ sum);
    }    
}
