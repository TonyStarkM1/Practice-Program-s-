// Q4)WAJP TO FIIND OUT SECOND SMALLEST ELEMENT IN A GIVEN ARRAY.
class Second_Smallest_Element_Of_Arr {
    public static void main(String[] args) {
        int[] arr = {23, 12, 2, 3, 45, -67, 98, 65, 43, 40, 98};
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] < min){
                sec_min =min;
                min = arr[i];
            }
            else if(arr[i] < sec_min && arr[i] != min)
            {
                sec_min = arr[i];
            }
        }
        System.out.println(sec_min);        
    }    
}
