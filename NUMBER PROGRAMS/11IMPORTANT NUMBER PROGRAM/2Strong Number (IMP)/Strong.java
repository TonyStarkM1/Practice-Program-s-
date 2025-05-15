
public class Strong {


    public static boolean isStrong(int num){
        int temp = num;
        int sum = 0;
        while (num !=0) {
            int ld = num % 10;
            sum = sum + factorial(ld);
            num = num /10;
        }
        if (temp == sum) {
            return true;
        }
        else{
            return false;
        }
    }


    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;           
        }
        return fact;
    }


    public static void main(String[] args) {
        if (isStrong(145)) {
            System.out.println("Strong");            
        }
        else{
            System.out.println("Not Strong");
        }
    }

}
