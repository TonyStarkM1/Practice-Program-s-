//Q13)WAJP TO FIND OUT THE SMALLEST ELEMENT PRESENT INSIDE A GIVEN ARRAY.
public class FindSmallestOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 21, 9, 35, 25, 54, 3, 6, 78};
        int small = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < small)
            {
                small = arr[i];
            }
        }
        System.out.println(small);       
    }    
}
