// Q2)WAJP TO PRINT AN ELEMENT ALONG WITH IST FREQUENCY IN A GIVEN ARRAY.

public class Array_Element_With_Frequency {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 1, 1, 2, 3, 4, 4, 5, 6};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != -1)
            {
                int count =1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j] == arr[i])
                    {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println(arr[i] + " = " + count);
            }
        }
    }    
}
