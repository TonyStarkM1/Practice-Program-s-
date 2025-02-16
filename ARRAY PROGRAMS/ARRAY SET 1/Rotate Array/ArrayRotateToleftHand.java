//Q11)WAJP TO ROTATE THE GIVEN ARRAY TO THE LEFT HAND SIDE n NO. OF TIMES.

import java.util.Arrays;
public class ArrayRotateToleftHand {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = 2;
        n = n % arr.length;
        while(n > 0)
        {
            int temp = arr[0];
            for(int i = 1; i <arr.length; i++)
            {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            n--;
        }
        System.out.println(Arrays.toString(arr)); 
    }
}

