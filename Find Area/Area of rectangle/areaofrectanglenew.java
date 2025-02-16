import java.util.Scanner;
class areaofrectanglenew{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		double l=scanner.nextDouble();
		System.out.println("Enter breadth of rectangle: ");
		double b=scanner.nextDouble();
		if(l>0 && b>0){
			double area =l*b;
			System.out.println("Area of rectangle: " +area);
		}
		else{
			System.out.println("Enter proper length and breadth");
			
		}
	}
}