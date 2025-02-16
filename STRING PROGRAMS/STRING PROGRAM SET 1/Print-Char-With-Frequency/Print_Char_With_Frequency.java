//Q6)WAJP TO PRINT A CHARACTER FROM A  GIVEN STRING ALONG WITH ITS FREQUENCY.

public class Print_Char_With_Frequency {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) != '*')
            {
                int count = 0;  
                for (int j = 0 ; j < str.length(); j++) {                   //This loop is used for count the frequency of 
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " has frequency of " + count);
                str = str.replace(str.charAt(i), '*');
            }
        }        
    }    
}



// =================Efficiant program==================================//


/*
public class Print_Char_With_Frequency {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) != '*')
            {
                int count = 1;   
                for (int j = i + 1 ; j < str.length(); j++) {                   //This loop is used for count the frequency of 
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " has frequency of " + count);
                str = str.replace(str.charAt(i), '*');
            }
        }        
    }    
}
 


 */