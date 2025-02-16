// Q5)WAJP TO PRINT ALL THE POSSIBLE SUBSTRINGS OF THE GIVEN STRING.

public class Print_Possible_Substring {
    public static void main(String[] args) {

        String str ="Hardik";
        
        for(int i = 0; i <= str.length();i++){
            System.out.println();
            for(int j = i ; j < str.length(); j++){
                System.out.println(str.substring(i, j + 1));
            }
        }
    }    
}




/*

Function

 */