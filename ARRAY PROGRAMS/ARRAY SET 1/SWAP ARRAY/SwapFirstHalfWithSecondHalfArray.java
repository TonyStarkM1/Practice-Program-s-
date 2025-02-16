//Q5)WAJP TO SWAP FIRST HALF OF AN ARRAY WITH THE SECOND HALF?
import java.util.Arrays;
public class SwapFirstHalfWithSecondHalfArray {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60}; 
       
        if(arr.length%2==0)
        {
         System.out.println("Befor swaping the array is " + Arrays.toString(arr));

            int i=0;
            int j=arr.length/2;          
            while (j<arr.length) 
            {
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                i++;
                j++;    
            }
            System.out.println("After swaping half element "+ Arrays.toString(arr));        
        }
        else
        {
            System.out.println("Invalid Count of elements!!!");
        }      
    }    
}
