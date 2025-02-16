//Q3)WAJP TO COUNT THE NUMBER OF DIGITS IN A GIVEN NUMBER

class countdigits{
		public static void main(String[] args){
			int num = 365;
			int count=0;
			while(num>0){
				count++;
				num=num/10;
			}
			System.out.println(count);
		}
}