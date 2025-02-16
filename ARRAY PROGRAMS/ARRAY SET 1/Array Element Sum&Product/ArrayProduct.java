import java.util.Arrays;
public class ArrayProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int product=1;
        for(int j=0;j<=arr.length-1;j++)
        {
            product*=arr[j];
        }
        System.out.println("The sum of Array "+ Arrays.toString(arr)+" is: "+ product);
    }    
}

