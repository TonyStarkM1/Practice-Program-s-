//Q4)WAJP TO COUNT THE NUMBER OF WORDS IN A GIVEN STRING SAPERATED BY COMMAS.     //  util is a package

class Count_No_Of_Words_Sap_By_Comma {
    public static void main(String[] args) {

        String str = "Ramesh, Suresh, Mahesh, Umesh, Ganesh, Dinesh";
        String[] arr = str.split(",");       //It Create Internally one array and store the  comma sepreate element
        System.out.println(arr.length);


            // System.out.println( Arrays.toString(arr));
            // for (int i = 0; i < words.length; i++) {
            //     System.out.println(arr[i]);    
            // }
    }    
}
