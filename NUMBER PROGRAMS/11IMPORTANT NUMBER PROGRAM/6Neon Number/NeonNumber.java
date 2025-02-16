//Q8)WAJP TO CHECK WHETHER A GIVEN NUMBER IS NEON NUMBER.IF THE NUMBER IS NEON THEN PRINT TRUE OTHERWISE FALSE.
/*
Explanation : 
 A neon number is a number where the sum of the digits of its square is equal to the original number.
 For example, 9 is a neon number because 9 squared is 81, and 8 + 1 = 9.
 */
 
 class NeonNumber{
	 public static void main(String[] args){
		int num = 9;
		int sq = num * num;
		int sum = 0;
		while(sq > 0)
		{
			sum += sq % 10;
			sq /=10;
		}
		System.out.println(sum == num);		
	}	 
 }