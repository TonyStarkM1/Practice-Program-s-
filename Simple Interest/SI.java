import java.util.Scanner;
class SI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal amount: ");
		double p=sc.nextDouble();
		
		System.out.println("Enter the rate of Interest (in %): ");
		double i=sc.nextDouble();
		
		System.out.println("Enter the Time period(in year): ");
		double r=sc.nextDouble();
		
		
		double SI=(p*i*r)/100;
		System.out.println("Simple Intrest is "+SI);
	}
}