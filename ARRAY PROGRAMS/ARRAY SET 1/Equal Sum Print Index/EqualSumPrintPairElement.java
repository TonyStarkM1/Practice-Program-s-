//Q15)WAJP TO PRINT THE PAIRS OF THE ELEMENTS FROM A GIVEN ARRAY WHOSE SUM IS EQUAL TO N.
public class EqualSumPrintPairElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n= 8;
        for(int i = 0; i < arr.length; i++)
        {
            for( int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == n)
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }        
    }    
}




