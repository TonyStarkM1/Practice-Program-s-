//Q2)WAJP TO FIND OUT K MINIMUM ELEMENT FROM THE GIVEN ARRAY.

import java.util.Arrays;
public class K_Minimum {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 60, 40, 90, 80, 70};
        int k = 1;
        Arrays.sort(arr);
        System.out.println("Kth min element =" + arr[k -1]);  
    }    
}
