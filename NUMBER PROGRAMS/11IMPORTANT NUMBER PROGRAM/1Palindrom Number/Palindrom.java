// 10)WAJP TO CHECK WHETHER THE GIVEN NUMBER IS PALINDROM.
class Palindrom{
	public static void main(String[] args){
		int num = 1221;     // 1221 -->True  & 24564 --> False
		int temp = num;
		int rev = 0;
		while(num>0){
			int ld = num %10;
			rev = rev * 10 + ld;
			num = num/10;
		}
		System.out.println(rev == temp);		
	}
}


