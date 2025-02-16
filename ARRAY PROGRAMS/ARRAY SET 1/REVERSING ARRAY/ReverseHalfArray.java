// Q4)WAJP TO SWAP ADJECENT ELEMENT IN AN ARRAY? 
import java.util.Arrays;
public class ReverseHalfArray {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60};
        //System.out.println("20, 10, 40, 30, 60, 50");
        System.out.println("Array before swaping Adjecent leement");
        System.out.println(Arrays.toString(arr));


        int i=1; 
        while(i < arr.length)
        {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i += 2;
           
        }
        System.out.println("Array After swaping Adjecent leement");
        System.out.println(Arrays.toString(arr));
        
    }
    
}



















/*

import java.util.Arrays;
public class ReverseHalfArray {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60};
        //System.out.println("20, 10, 40, 30, 60, 50");
        System.out.println("Array before swaping Adjecent leement");
        System.out.println(Arrays.toString(arr));

        
        int i=0;
        int j =i + 1;  //1
        
        while(j < arr.length)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j +=2;
        }
        System.out.println("Array After swaping Adjecent leement");
        System.out.println(Arrays.toString(arr));
        
    }
    
}
 */