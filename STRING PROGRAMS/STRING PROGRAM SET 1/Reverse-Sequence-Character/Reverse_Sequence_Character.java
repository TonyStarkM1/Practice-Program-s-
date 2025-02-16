//Q3)WAJP TO REVERSE THE SEQUENC OF CHARACTER IN A GIVEN STRING.

public class Reverse_Sequence_Character {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        String temp = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) 
        {
            char ch = str.charAt(i);
            temp = temp + str.charAt(i);               
        }
        str = temp; 
        System.out.println(str);
    }
}
