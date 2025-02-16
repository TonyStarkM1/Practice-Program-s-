class largestoftwo{
	public static void main(String[] args){
		int a=20;
		int b=10;
		// if(a>b){
			// System.out.println(a+ " is largest");
		// }
		// else{
			// System.out.println(b+ " is largest");
		// }
		
		int largest=a;
		if(a < b){
			largest=b;
		}
		System.out.println(largest);
	}
}