//Q5)WAJP TO CALCULATE THE PRODUCT OF ODD DIGIT IN A GIVEN NUMBER.

class ProductOfOddDigit{
	public static void main(String[] args){
		int num = 64985;
		int product = 1;
		while( num > 0){
			int ld = num % 10;
			if(ld % 2 == 1){
				product = ld * product;
			}
			num = num / 10;
		}
		System.out.println(product);
	}
}