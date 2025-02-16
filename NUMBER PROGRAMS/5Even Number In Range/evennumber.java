class evennumber{
	public static void main(String[] args){
		int startingrange=1;
		int endingrange=10;
		int i=startingrange;
		while(i<=endingrange){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
	}
}