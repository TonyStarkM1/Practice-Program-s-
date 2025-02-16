//calculate the sum of all the prime number in the range

class PrimeNumberInRange{
	public static void main(String[] args){
		int startingRange = 1;
		int	endingrange =100;
		int count=0;
		int sum=0;
		for(int num=startingRange; num<=endingrange;num++){
			count=2;
			if(num == 1)
				count = 1;		
			for(int f=2; f<=num/2; f++){
				if(num % f==0)
					count++;
				if(count>2)
					break;
			}	
			if(count == 2)
				System.out.println(num);
				sum=sum+num;
		}
		System.out.println(sum);
	}
}