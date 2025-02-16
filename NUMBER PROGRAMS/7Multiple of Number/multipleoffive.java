//Q2)WAJP TO PRINT ALL THE NUMBERS BETWEEN 1 & N WHICH ARE MULTIPLE OF 3 & 4 & 5


class multipleoffive{
	public static void main(String[] args){
		int n= 100;
		for(int num=1;num<=n;num++){
			if( /*num % 3 == 0 && num % 4 == 0 &&*/ num % 5 == 0 ){
				System.out.println(num);
			}
		}
	}
}
