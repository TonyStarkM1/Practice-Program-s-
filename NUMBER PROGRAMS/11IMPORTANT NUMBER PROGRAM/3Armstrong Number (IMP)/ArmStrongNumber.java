//Q6)WAJP TO CHECK WHETHER A GIVEN NUMBER IS ARMSTRONG NUMBER.IF THE NUMBER IS ARMSTROMG THEN PRINT TRUE OTHWEWISE FALSE.
/*Explanation:
An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Example 1:												Example 2:
Input:N = 153											Input:N = 371
Output:True												Output: True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153			Explanation: 33+53+13 = 27 + 343 + 1 = 371

*/
class ArmStrongNumber{
	public static void main(String[] args){
		int num=153;
		int copy1=num;
		int copy2=num;
		int count=0;
		while(num > 0){
			count++;
			num/=10;
		}
		int sum = 0;
		while(copy1 > 0){
			int d = copy1 % 10;
			int pow = 1;
			for(int i = 1; i <= count; i++){
				pow *= d;
			}
			sum+=pow;
			copy1/=10;
		}
		System.out.println(sum == copy2);		
	}
}