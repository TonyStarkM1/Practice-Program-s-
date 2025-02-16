// Q9)WAJP TO PRINT FACTORS OF A GIVEN NUMBER.

class Factors{
	public static void main(String[] args){
		int num = 6;   //1,2,3,6
		System.out.println(1);
		for(int f = 2; f<=num/2;f++){
			if(num % f == 0){
				System.out.println(f);
			}
		}			
		System.out.println(num);			
	}	
}