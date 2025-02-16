//Q5)WAJP TO CHECK WHETHER THE GIVEN NUMBER IS STRONG NUMBER.IF THE NUMBER IS STRONG THEN PRINT TRUE OTHERWISE FALSE.
/*
A strong number is a positive integer where the sum of the factorials of its digits is equal to the original number.
Explanation: 
For example, 145 is a strong number because
 145 =Factorials [1! + 4! + 5!] = Factorials Addition[1 + 24 + 120] = 145.
*/

class StrongNumber{
	public static void main(String[] args){
		int num =145;
		int copy = num;
		int sum = 0;
		while(num>0){
			int ld = num % 10;
			int fact = 1;
			for(int i = 2; i <= ld; i++){
				fact *= i;
			}
			sum += fact;
			num /= 10;
		}
		System.out.println(sum == copy);
		// if (sum == copy) {
		// 	System.out.println(copy + " is a Strong Number");		
		// } 
		// else {
		// 	System.out.println(copy + " is Not a Strong Number");
		// }
	}
}