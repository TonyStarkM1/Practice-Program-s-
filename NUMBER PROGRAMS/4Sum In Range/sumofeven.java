// Q4)WAJP TO CALCULATE SUM THE OF EVEN DIGITS IN A GIVEN NUMBER.

class sumofeven{
	public static void main(String[] args){
		int num= 45786;
		int sum=0;
		while(num > 0){
			int d=num%10;
			if(d % 2  ==0){
				 sum=sum+d;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}