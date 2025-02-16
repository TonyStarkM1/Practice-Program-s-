//Q10)WAJP TO ROTATE THE GIVEN ARRAY TO THE RIGHT HAND SIDE n NO. OF TIMES.

import java.util.Arrays;
public class ArrayRotateToRightHand {    
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40};
        int n=2;
       // n = n% arr.length;
        while(n > 0)
        {
            int temp= arr[arr.length - 1];
            for(int i = arr.length - 1; i>0; i--)
            {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
