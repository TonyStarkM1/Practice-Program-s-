//Q4)WAJP TO CHECK WHETHER A GIVEN NUMBER IS PERFECT NUMBER.IF THE NUMBER IS PERFECT THEN PRINT TRUE OTHERWISE PRINT FALSE.
/*
A perfect number is a positive integer that is equal to the sum of its proper divisors, or divisors 
excluding the number itself:
he first four perfect numbers are 6, 28, 496, and 8,128. Mathematicians have discovered 51 perfect numbers, 
with the largest containing 49,724,095 digits.

Example: 6 is a perfect number because 1 + 2 + 3 = 6
		 28 is a perfect number because 1 + 2 + 4 + 7 + 14 =28
*/
//import java.util.Scanner;
class PerfectNumber{
	public static void main(String[] args){
		//Scanner sc= new Scanner(System.in);
		//int num= sc.nextInt();		
		int num = 6; 
		int sum = 1;
		for(int f = 2;f <= num/2; f++){
			if(num % f == 0)
				sum = sum + f;
		}
		System.out.println(sum == num);
	}
}