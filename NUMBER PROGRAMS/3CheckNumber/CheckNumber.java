import java.util.Scanner;
class CheckNumber{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		//int num = 69;
		if(num>0){
			System.out.println("The number is Positive(+)");
		}
		if(num<0){
			System.out.println("The number is Negative(-)");
		}
		if(num==0){
			System.out.println("The number is zero(0)");
		}
	}
		
}