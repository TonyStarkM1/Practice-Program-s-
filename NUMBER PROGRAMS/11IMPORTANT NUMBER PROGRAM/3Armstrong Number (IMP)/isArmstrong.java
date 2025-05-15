class isArmstrong{
    public static boolean  isArmstrong(int num){
        int temp = num;
        int sum = 0;
        int count = countDigits(num);
        while (num!=0) {
            int ld = num %10;
            sum = sum +xPowerN(ld,count);
            num = num/10;
        }
        return temp == sum;
    }

    public static int xPowerN(int x, int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return  result;
    }
    public static int countDigits(int n){
        int count = 0;
        if (n == 0) {
            return 1;            
        }
        else{
            while (n!=0) {
                count++;
                n=n/10;
            }
            return count;            
        }
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        int num2=153;
        System.out.println(isArmstrong(num2) ? num2+" isArmstrong": num2 +" is not Armstrong");
    }
}