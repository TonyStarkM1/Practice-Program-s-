//Q9)WAJP TO CHECK WHETHER A GIVEN NUMBER HAPPY NUMBER.PRINT TRUE IF THE NUMBER IS HAPPY OR PRINT FALSE IF THE NUMBER IS SAD.
/*
A Happy Number is a positive integer that eventually reaches 1 when you repeatedly replace it with the 
sum of the squares of its digits:

Start with any positive integer, and replace it with the sum of the squares of its digits. Repeat this process
until the number equals 1, or it loops endlessly in a cycle that doesn't include 1.

Example:
13 is a happy number because 13 → 1^2 + 3^2 = 10 → 1^2 + 0^2 = 1(Happy Number). & 4(Sad Number)
*/	

class HappyNumber{
	public static void main(String[] args){
		int num=1; 		
		while(num!=1 && num!=4)
		{
			int sum=0;
			while(num > 0)
			{
				int ld = num % 10;
				int sq = ld * ld;
				sum +=sq;
				num /= 10;
			}
			num = sum;
		}
		System.out.println(num == 1);
	}	
}