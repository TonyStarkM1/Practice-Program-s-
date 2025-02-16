//Q7)WAJP TO PRINT UNIQUE CHARACTER S FROM A GIVEN STRING.

public class Print_Unique_Character {
    public static void main(String[] args) {
        String str = "Java is aprogramming language";
        System.out.println("Unique Character are:");
        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) != '*')
            {
                int count = 1;  
                for (int j = i + 1; j < str.length(); j++) {     //This loop is used for count the frequency of 
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                if(count == 1) {
                    System.out.println(str.charAt(i));
                    str = str.replace(str.charAt(i), '*');
                }
            }        
        }
    }
}
