public class SOLID_INVERT_Pyramid_Pattern {
    public static void main(String[] args) 
    {
        int n = 10;
        for(int i=n; i  > 0; i--)
        {
            for(int j=1; j <= n - i ;j++)
            {
                System.out.print("  ");
            }

            for(int j=1; j <=  2 * i - 1; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }   
    }    
    
}
