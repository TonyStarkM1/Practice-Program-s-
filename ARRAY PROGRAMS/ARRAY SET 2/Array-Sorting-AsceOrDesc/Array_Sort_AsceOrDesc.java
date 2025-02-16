// Q6)WAJP TO SORT A GIVEN ARRAY EITHER IN ASSENDING OR DESCINDING ORDER.
import java.util.Arrays;
class Array_Sort_AsceOrDesc {
    public static void main(String[] args) {

        int[] arr = {20, 10, 40, 60, 30, 50};

        System.out.println("Array Before sorting:");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            for(int j= i+1;j<arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println("Array After sorting(Ascending):");
        System.out.println(Arrays.toString(arr));    
    }    
}




/*
 
import java.util.Arrays;
class Array_Sort_AsceOrDesc {
    public static void main(String[] args) {

        int[] arr = {20, 10, 40, 60, 30, 50};
       
        for(int i = 0; i < arr.length; i++){
            for(int j= i+1;j<arr.length; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println("Array After sorting(Descending):");
        System.out.println(Arrays.toString(arr));             
    }    
}

*/