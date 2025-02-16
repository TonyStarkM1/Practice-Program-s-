//Q1)WAJP TO COUNT THE VOVELS , CONSONENTS IN A GIVEN STRING CONTAINING ALPHABETS 

public class Count_Vovels_and_Consunents {
    public static void main(String[] args) {
       String str = "Hello World";
       str = str.toUpperCase();
       int v = 0;
       int c = 0;

       for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                if(ch == 'A' ||  ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                v++;
            else
                c++;
            }           
        }
       System.out.println("Vovels = " + v);
       System.out.println("Consonents = " + c);
    }   
}











//===============================================================//



// public class Count_Vovels_and_Consunents {
//     public static void main(String[] args) {
//        String  str = "HELLO ";
//        String new_str = str + "World";
//        System.out.println(new_str);
//     }   
// }




//===================================================================================//


// public class Count_Vovels_and_Consunents {
//     public static void main(String[] args) {
//        // String  str = "HELLO WORLD";
//        // String str = "hello hardik";
//          String str = "hello world @ 1234";
//          String new_String =str.toLowerCase();    //METHOD
//          String new_String1 =str.toUpperCase();

        
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i));
//         }

//         System.out.println();
//         System.out.print(new_String);

//         System.out.println();
//         System.out.println(new_String1);
//     }   
// }


//==================================================================================//


// public class Count_Vovels_and_Consunents {
//     public static void main(String[] args) {
//         String  str = "Hello World";
//         for (int i = 0; i < str.length(); i++) {

//             System.out.print(str.charAt(i));
           
//         }        
//     }   
// }
