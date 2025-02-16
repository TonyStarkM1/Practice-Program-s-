//Q1)WAJP TO PRINT FIRST N ELEMENT OF FIBONACCI SERIES. (This is Dynamic program due to changing value of a and b)
class Fibonacci{
	public static void main(String[] args){
		int n=10;//0;
		if(n>=2){
			int a=0;
			int b=1;
			System.out.print(a +" ");
			System.out.print(b + " ");
			for(int i=1;i<=n-2;i++){
				int c= a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}
		else{
			System.out.println("Invalid n value!!!!");
		}
	}
}