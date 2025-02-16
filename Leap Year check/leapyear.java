import java.util.Scanner;
class leapyear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year=sc.nextInt();
		// int year=1900;
		if(year>0){
			if(year%400==0 && year%4==0 || year%100 !=0){
				System.out.println(year+" was Leap Year");
			}
			else{
				System.out.println(year+" was Not A leap Year");
			}
			
		}
		else{
			System.out.println("!!!!!!!! Invalid Year !!!!!!!!!!!!1");
		}
	}
	
}