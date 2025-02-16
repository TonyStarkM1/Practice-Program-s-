//Q10)WAJP  TO COUNT THE NUMBER OF WORDS HAVING EVEN LENGTH WHERE WORDS ARE SAPERATED BY COMMAS.
import java.util.Scanner;
public class Count_Words_Of_Even_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        // String str = "ramesh,suresh,mahesh,umesh,ganesh,dinesh "; 
        String[] arr = str.split(",");
        String temp ="";
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            String name = arr[i];
            temp = temp + (char)(name.charAt(0) - 32) + name.substring(1, name.length()) ;            
            if(i != arr.length - 1)
            temp = temp + ",";
        }
        str = temp;
        System.out.println(str);  
    }    
}

//Q10)WAJP  TO COUNT THE NUMBER OF WORDS HAVING EVEN LENGTH WHERE WORDS ARE SAPERATED BY COMMAS.
