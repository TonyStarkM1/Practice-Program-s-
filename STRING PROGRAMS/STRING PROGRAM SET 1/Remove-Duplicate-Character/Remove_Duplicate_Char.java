//Q8)WAJP TO REMOVE DUPLICATE CHARACTER FROM A GIVEN STRING.

public class Remove_Duplicate_Char 
{
    public static void main(String[] args) 
    {

        String str = "Hello World";
        System.out.println(str);
        String temp = "";
        for (int i = 0; i < str.length(); i++)
        { 
            char ch = str.charAt(i);
            boolean present = false;
            for (int j = 0; j < temp.length(); j++)
            {
                if (temp.charAt(j)  == ch)
                {
                    present = true;
                    break;
                }
            }
            if (!present) 
            {
                temp = temp + ch;
            }           
        }       
        str =temp;
        System.out.println(str);        
    }
}
        // String str = "Hello World";
        // String temp = "";
        // for (int i = 0; i < str.length(); i++)
        // {    
        //     if (str.charAt(i) != '*') 
        //     {
        //         temp = temp +str.charAt(i);
        //         str = str.replace(str.charAt(i), '*');
        //     }
        // }       
        // str =temp;
        // System.out.println(str);   
        
        

       






    




    
    
       





            

