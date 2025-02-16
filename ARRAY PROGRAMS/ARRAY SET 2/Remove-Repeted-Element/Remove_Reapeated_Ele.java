// Q7)WAJP TO REMOVE DUPLICATE ELEMENT FROM GIVEN ARRAY.
import java.util.Arrays;
public class Remove_Reapeated_Ele {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3, 4, 5, 3, 6};
        System.out.println("Array Beforew removing Duplicates");
        System.out.println(Arrays.toString(arr));
        int k = 0;
        for(int i= 1;i<arr.length;i++){
            boolean flag = false;
            for(int j = i -1; j >= 0;j--){
            if(arr[j] == arr[i])
            {
                flag = true;
                break;
            }
        }
        if(!flag){
            k++;
            if(i != k){
                int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
            }
        }
    }
    arr = Arrays.copyOf(arr, k + 1);
    System.out.println("Array After removing Duplicates");
        System.out.println(Arrays.toString(arr));
    }
    
}
