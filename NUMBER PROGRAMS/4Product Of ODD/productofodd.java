// Q1)WAJP TO CALCULATE THE PRODUCT OF ALL ODD NUMBERS PRESENT BETWEEN 1 & N.

class productofodd{
	public static void main(String[] args){
		
		int n=10;
		int product =1;		
		for(int num=1;num<=n;num++){
			if(num%2==1){
				product=product*num;
			}			
		}	
		System.out.println(product);		
	}
}



/*

class productofodd{
	public static void main(String[] args){
		int startingRange = 1;
        int endingRange = 10;
        int i = startingRange;
        int product = 1;
        
        while (i <= endingRange) {
            if (i % 2 == 1) {
                product = product * i;                
            }
            i++;
        }
        System.out.println("The product of odd number is: " + product);
        
	}

}
*/