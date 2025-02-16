//calculate the  sum of all the even digit whether the sum is prime or not.

public class PrimeSum {
    public static void main(String[] args) {
		int num=7;
		int sum=0;
		int count=2;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==0){
				sum=sum+ld;
			}
			num=num/10;				
		if(sum==1)
		{
			count=1;
		}
		for(int i=2;i<=sum/2;i++){
			if(sum%i==0)
			{
				count++;
			}
			if(count>2)
			break;
		}
		}
		
		System.out.println(count==2);		
	}	
}
