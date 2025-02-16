//Q3)WAJP TO REVERSE THE ORDER OF ELEMENTS IN AN ARRAY ?
import java.util.Arrays;
class  ReverseArray{
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60};
       System.out.println("Array before Reversing th order if elements");
       System.out.println(Arrays.toString(arr));

       int i = 0;
       int j = arr.length - 1;
       while(i < j)
       {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
       }
       System.out.println("Array After Reversing th order if elements");
       System.out.println(Arrays.toString(arr));
    }
   
}

















/*
  System.out.println("Array Before Reverse:");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }

   // System.out.println(" 60, 50, 40, 30, 20, 10 ");

        System.out.println("Array After Reverse:");
        for(int i=arr.length-1;i>=0;i--)
       {
        System.out.println(arr[i]);
       }
 */