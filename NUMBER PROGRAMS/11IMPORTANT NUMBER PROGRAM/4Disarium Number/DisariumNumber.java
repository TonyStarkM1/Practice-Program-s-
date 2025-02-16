//Q7)WAJP TO CHECK WHETHER A GIVEN NUMBER IS DISARIUM NUMBER.IF THE NUMBER IS DISARIUM NUMBER THEN PRINT TRUE OTHERWISE FALSE.
/*A Disarium Number is a number in which the sum of the digits to the power of their respective position is equal to the number 
itself.
Example : 135 =1^1+3^2+5^3  i.e [1+9+125]=135
		  89  = 8^1+9^2   = i.e [8+81]=89
Hence, 135 is a disarium number.

*/

class DisariumNumber{
	public static void main(String[] args)
	{
		int num=89;
		int copy1=num;
		int copy2=num;
		int count=0;
		while(num>0)
		{
			count++;
			num /= 10;			
		}
		int sum=0;
		while(copy1 > 0)
		{
			int d=copy1%10;
			int pow=1;
			for(int i=1; i<=count; i++)
			{
				pow *= d;
			}
			sum += pow;
			copy1 /= 10;
			count--;
		}
		System.out.println(sum == copy2);
	}	
}