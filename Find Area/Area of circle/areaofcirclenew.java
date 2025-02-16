import java.util.Scanner;
class areaofcirclenew{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double r=scanner.nextDouble();
		if(r>0)
		{
		double area=3.14*r*r;
		System.out.println("Area of circle : "+area+"unit.sq.");
		}
		else{
			System.out.println("Invalid radius value!!");
		}
	}
	
}