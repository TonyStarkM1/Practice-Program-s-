//Q8)WAJP TO COMBINE TWO GIVEN ARRAYS.

import java.util.Arrays;
public class Combine2Arrays {
    public static void main(String[] args) {
        int[] arr1={10, 20, 30, 40};
        int[] arr2={50, 60, 70, 80, 90};
        int[] arr3=new int[arr1.length + arr2.length];
       // System.out.println(Arrays.toString(arr3));

       System.out.println("Array arr1 before Combining: "+Arrays.toString(arr1));
       System.out.println("Array arr2 before Combining: "+Arrays.toString(arr2));
       int j=0;
       for(int i=0;i<arr1.length;i++)
       {
            arr3[j]=arr1[i];
            j++;
       }
       for(int i=0;i<arr2.length;i++)
       {
            arr3[j]=arr2[i];
            j++;
       }
       System.out.println("Array After Combining: "+Arrays.toString(arr3));        
    }    
}
