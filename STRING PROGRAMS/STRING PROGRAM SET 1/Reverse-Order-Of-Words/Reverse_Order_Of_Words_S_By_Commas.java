//Q5)WAJP TO REVERSE THE ORDER OF WORDS IN A  GIVEN STRING SAPERATED BY COMMAS.

public class Reverse_Order_Of_Words_S_By_Commas {
    public static void main(String[] args) {
        
        String str = "Ramesh, Suresh, Mahesh, Umesh, Ganesh, Dinesh, Jayesh";
        System.out.println(str);   // Original string
        String temp = "";
        String[] arr = str.split(",");       //It Create Internally one array and store the  comma sepreate element
        for (int i = arr.length - 1; i >= 0; i--)
         {
            if(i != 0){
                temp = temp + arr[i] + ",";
            }
            else{
                temp = temp + arr[i];
            }         
        }
        str = temp;
        System.out.println(str);  
    }    
}
