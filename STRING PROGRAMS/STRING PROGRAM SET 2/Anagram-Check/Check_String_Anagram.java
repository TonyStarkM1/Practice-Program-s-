
import java.util.Arrays;

//Q3)WAJP TO CHECK WHETHER GIVEN STRINGS IS ANAGRAM STRING, IF THE GIVEN STRINGS ARE ANAGRAM THEN PRINT TRUE OTHERWISE FALSE.

public class Check_String_Anagram {
    public static void main(String[] args) {
        
        String str1 = "silent";
        String str2 = "listen";
        if(str1.length() == str2.length()){
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            System.out.println(Arrays.equals(arr1, arr2));
        }
        else
        System.out.println("False");
    }
}
