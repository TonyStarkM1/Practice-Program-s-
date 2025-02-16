//Q6)WAJP TO CALCULATE THE SUM OF THE SQUARES OF EACH DIGIT IN A NUMBER.

class SumOfSquareOfEachDigit{
	public static void main(String[] args){
	int num = 3422;
	int sum = 0;
	while(num > 0){
	int ld=num % 10;
	int Square=ld*ld;
	sum=sum+Square;
	num=num/10;
	}
	System.out.println(sum);	
	}

}