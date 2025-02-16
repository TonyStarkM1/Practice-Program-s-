public class Nearest_Pallindrom_No {
    public static void main(String[] args) 
    {
        int num = 146;
        if(num == reverse(num))
        System.out.println(num);
        else{
            int p1;
            int p2;
            int i= num + 1;
            while(true){
                if(i == reverse(i))
                {
                    p1 = i;
                    break;
                }
                i++;
            }
            i = num - 1;
            while(true){
                if(i == reverse(i)){
                    p2 = i;
                    break;
                }
                i--;
            }
            if(num - p2 == p1 - num)
            System.out.println(p1 + ", " + p2);
            else if(num - p2 < p1 - num)
            System.out.println(p2);
            else
                System.out.println(p1);
        }
    }   
    private static int reverse(int num){
        int rev = 0;
        while(num > 0)
        {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    } 
}
