//Q1)WAJP TO FIND OUT K MAXIMUM ELEMENT FORM  A GIVEN ARRAY.
import java.util.Arrays;
public class K_Maximum {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 60, 40, 90, 80, 70};
        int k = 1;
        Arrays.sort(arr);
        System.out.println("Kth max element =" + arr[arr.length - k]);  //Max
        System.out.println("Kth min element =" + arr[k -1]);            //Min
    }    
}
