// Q1)WAJP TO CREATE A COPY OF EXISTING ARRAY.
import java.util.Arrays;
public class Copy_Of_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        //Shallow copy
        int[] copy1 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            copy1[i]=arr[i];
        }
        System.out.println("Copy Of Array: "+ Arrays.toString(copy1));

        //Deep copy
        int [] copy2= arr;
        System.out.println("Original Array: "+ Arrays.toString(copy2));           
    }
}

