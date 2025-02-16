//Q12)WAJP TO PRINT ALL THE UNIQUE ELEMENTS PRESENT INSIDE THE GIVEN ARRAY.
public class PrintUniqueElementOfArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 1, 3, 4, 2, 2, 3, 5, 6, 7, 8, 6, 9};
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == arr[i])
                {
                    count++;
                    if(count > 1)
                        break;
                }
            }
            if(count == 1)
            System.out.println(arr[i]);
        }
    }
}
