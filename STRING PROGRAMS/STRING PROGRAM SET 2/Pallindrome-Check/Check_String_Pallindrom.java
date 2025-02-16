//Q2)WAJP TO CHECK WHETHET STRING IS PALLINDROM. IF THE GIVEN STRING IS PALLINDROM THE PRINT TRUE OTHERWISE PRINT FALSE.

public class Check_String_Pallindrom {
    public static void main(String[] args) {
        String str = "NAYAN";
        String rev = "";
        for(int i = str.length() - 1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev.equals(str));        
    }    
}
