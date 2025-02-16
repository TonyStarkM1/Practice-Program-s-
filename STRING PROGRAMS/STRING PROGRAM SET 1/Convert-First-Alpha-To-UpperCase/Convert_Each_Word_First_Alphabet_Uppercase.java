//Q9)WAJP TO CONVERT THE FIRST APLHABET OF EACH WORD TO UPPER CASE WHERE THE WORDS ARE SAPERATED BY COMMAS.


public class Convert_Each_Word_First_Alphabet_Uppercase {
    public static void main(String[] args) {
        String str = "ramesh,suresh,mahesh,umesh,ganesh,dinesh ";    //After comma space must not there
        System.out.println(str);    
        String temp ="";
        String[] arr = str.split(",");
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








/*
 
public class Convert_Each_Word_First_Alphabet_Uppercase {
    public static void main(String[] args) {
        String str = "ramesh,suresh,mahesh,umesh,ganesh,dinesh ";    //After comma space must not there
        System.out.println(str);    
        String temp ="";
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {

            String name = arr[i];
            if(i != arr.length - 1)
                temp = temp + (char)(name.charAt(0) - 32) + name.substring(1, name.length()) + "," ;
            else
            temp = temp + (char)(name.charAt(0) - 32) + name.substring(1, name.length()) ;            
        }
        str = temp;
        System.out.println(str);    
    }
}

 */