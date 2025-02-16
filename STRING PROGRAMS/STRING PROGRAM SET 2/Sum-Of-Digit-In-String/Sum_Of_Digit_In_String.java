

// Q1)WAJP TO CALCULAT THE SUM OF DIGITS PRESENT INSIDE THE GIVEN STRING.

public class Sum_Of_Digit_In_String {
   public static void main(String[] args) {
     String str = "Hello@1234";
     int sum = 0;
      for (int i = 0; i < str.length(); i++) 
      {
        char ch = str.charAt(i);
        if(ch >= '0' && ch <= '9')
         sum = sum + ch -48;  
      }
      System.out.println(sum);
   }
}
