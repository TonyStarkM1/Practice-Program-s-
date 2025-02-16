// Q7)WAJP TO DELETE AN ELEMENT FROM THE SPECIFIC INDEX.

import java.util.Arrays;
public class DeletElementFromArray {
    public static void main(String[] args) {
        int arr[]={10, 20, 40, 50, 60};
        //int ele = 40;
        int index =2;
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length - 1];
    //    System.out.println(Arrays.toString(temp));

        int i=0;
        int j=0;
        while(i < arr.length)
        {
            if(i!=index)
            {
                temp[j] = arr[i];
                j++;
            }
            i++;
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));        
    }    
}
