class Comma_Saperated_String{
    public static void main(String[] args) {
        String str ="Java is a Programming language. Java supports OOP.,3,10";
        char ch = 'a';

        String[] arr = str.split(",");
        System.out.println("Comma Separated String First");
        System.out.println(arr[0]);
        System.out.println("Comma Separated String Second");
        System.out.println(arr[1]);
        System.out.println("Comma Sapreated String Third");
        System.out.println(arr[2]);
        
        int start = Integer.parseInt(arr[1]);
        int   end = Integer.parseInt(arr[2]);

        boolean present = false;
        for( int i = start; i <= end; i++){
            if(arr[0].charAt(i) == ch){
                present = true;
                break;
            }
        }

        System.out.println("Output:");
        System.out.println(present);
    }
}





/*
 




 */