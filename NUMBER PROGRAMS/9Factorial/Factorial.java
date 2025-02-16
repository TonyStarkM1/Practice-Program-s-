//Q7)WAJP TO CALCULATE FACTORIAL OF A GIVEN NUMBER

class Factorial{
	public static void main(String[] args){
		int num = 10;   //5*4*3*2*1
		int fact = 1;
		for(int i=2;i<=num;i++){
			fact=fact * i;
		}
		System.out.println("Factorial is "+ fact);
		
		
		
		/*for(int i=factorial;i<=num;i++){
			factorial=factorial * i;
		}
		
		System.out.println(factorial);
			*/
	}
}