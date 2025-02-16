//Q3)WAJP TO PRINT ALL THE PRIME NUMBERS PRESENT BETWEEN 1 AND N.
class printprime{
	public static void main(String[] args){
		int n= 100;
		for(int num=1; num<=n;num++){
			int count=2;
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
		}
	}
}