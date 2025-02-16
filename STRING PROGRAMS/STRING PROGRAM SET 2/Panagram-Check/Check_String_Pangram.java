//Q4)WAJP TO CHECK WHETHER GIVEN STRING IS PANGRAM STRING.

public class Check_String_Pangram {
    public static void main(String[] args) {
        String str = "AbCDEFGHIJKLMNoPQRsTuVWXYZAABB";
        str = str.toUpperCase();

        boolean present = false;
        for(char ch = 'A'; ch <='Z'; ch++)
        {
            present = false;
            for(int i = 0; i < str.length()/*<--Its a method */; i++){

                if(str.charAt(i) == ch){
                    present = true;
                    break;
                }
            }
            if(!present)
            break;
        }
        System.out.println(present);
    }    
}






//variable scope note
/*=====================Efficiant program ===============================*/

/*

public class Check_String_Pangram {
    public static void main(String[] args) {
        String str = "AbCEFGHIJKLMNoPQRsTuVWXYZAABB";
        str = str.toUpperCase();
        int count = 0;
        int k = 0;
        for(char ch = 'A'; ch <='Z'; ch++){
            boolean present = false;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ch){
                    present = true;
                    count++;
                    break;
                }
            }
            if(!present)
            break;
            k++;
        }
        System.out.println("Nunber of Itteration Are:" + k);
        System.out.println(count == 26);
    }    
}

 */








/*

public class Check_String_Pangram {
    public static void main(String[] args) {
        String str = "AbCDEFGHIJKLMNoPQRsTuVWXYZAABB";
        str = str.toUpperCase();
        int count = 0;

       
        for(char ch = 'A'; ch <='Z'; ch++){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ch){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count == 26);
    }    
}

 */