public class FindLargestOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 21, 9, 35, 25, 54, 3, 6, 78};
        int large = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > large)
            {
                large = arr[i];
            }
        }
        System.out.println(large);       
    }       
}
