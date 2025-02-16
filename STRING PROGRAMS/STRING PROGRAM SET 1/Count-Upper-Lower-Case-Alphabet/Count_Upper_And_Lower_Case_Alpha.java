//Q2)WAJP TO COUNT UPPERCASE ALPHABET AND LOWERCASE ALPHABETS IN A GIVEN STRING.
import java.util.*;
public class Count_Upper_And_Lower_Case_Alpha {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        String  str = sc.nextLine();
        // String str = "Hello World";
        int u = 0;
        int l = 0;
 
        for (int i = 0; i < str.length(); i++) 
         {
             char ch = str.charAt(i);
             if(ch >= 'A' && ch <= 'Z')
                 u++;
             else if(ch >= 'a' && ch <= 'z')
                 l++;             
         }
        System.out.println("Uppercase Alphabet = " + u);
        System.out.println("Lowercase Alphabet = " + l);
     } 
}
