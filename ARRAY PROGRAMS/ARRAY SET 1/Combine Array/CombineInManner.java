// Q9)WAJP TO COMBINE TWO GIVEN ARRAYS IN ZIG-ZAG MANNER.

import java.util.Arrays;
public class CombineInManner {
    public static void main(String[] args) {
        int[] arr1={10, 20, 30, 40};
        int[] arr2={50, 60, 70, 80, 90, 100};
        int[] arr3=new int[arr1.length + arr2.length];
        //System.out.println(Arrays.toString(arr3));

        int min = arr1.length;
        if(arr2.length < arr1.length)        
            min = arr2.length;

        int j=0;
        for(int i=0;i < min ;i++){
             arr3[j]=arr1[i];  
             j+=2;
        }
        j=1;
        for(int i=0;i < min ;i++){
             arr3[j]=arr2[i];
             j+=2;
        }
        j--;
        for(int i=min; i< arr1.length;i++){
                arr3[j] = arr1[i];
                j++;
        }
        for(int i=min; i<arr2.length;i++){
                arr3[j] = arr2[i];
                j++;
        }
       System.out.println("Array After Combining: "+Arrays.toString(arr3));          
    }    
}
