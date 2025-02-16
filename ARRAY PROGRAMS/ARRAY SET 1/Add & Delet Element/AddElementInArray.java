
//Q6)WAJP TO ADD AN ELEMENT IN GIVEN ARRAY AT SPECIFIC INDEX.

import java.util.Arrays;
public class AddElementInArray {
    public static void main(String[] args) {
        int arr[]={10, 20, 40, 50, 60};
        int ele = 30;
        int index =2;
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length + 1];      //Here I am Creating an array of size (arr.length+1)
    //    System.out.println(Arrays.toString(temp));

        int i=0;
        int j=0;
        while(j< temp.length)
        {
            if(j != index)
            {
                temp[j] = arr[i];
                i++;
            }
            j++;
        }
        temp[index]=ele;      //Adding Element in index
        arr = temp;          //change refrence of array
        System.out.println(Arrays.toString(arr));

    }
}


    

