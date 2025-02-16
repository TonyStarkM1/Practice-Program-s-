//Q2)WAJP TO CHECK WHETHET A GIVEN NUMBER IS A PRIME NUMBER.PRINT TRUE IF THE NUMBER IS PRIME  OTHERWISE FALSE.
class primeNumbercheck{
	public static void main(String[] args){
		int num= 5;  // 28;
		int count=2;
		if(num == 1)
			count = 1;		
		for(int i=2; i<=num/2; i++){
			if(num % i==0)
				count++;
			if(count>2)
				break;
		}	
		System.out.println(count == 2);
	}
}
