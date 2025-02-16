class checknum{
	public static void main(String[] args){
		int num=5;
		String res = "Zero";
		if(num!=0){
			if(num>0){
				res="Positive";
			}
			else{
				res="Negative";
			}
			
		}
		System.out.println(res);
	}
}