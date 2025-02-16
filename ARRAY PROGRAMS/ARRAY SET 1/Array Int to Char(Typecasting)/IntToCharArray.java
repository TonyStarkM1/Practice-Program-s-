public class IntToCharArray {
    
    public static char[] tochar(int[] arr)
    {
        char[] ch = new char[arr.length];
        for(int i=0;i<ch.length;i++){
            ch[i]=(char)arr[i];
        }
        return ch;
    }

    
    public static void main(String[] args) {
        int[] arr={65, 66, 67, 68, 69};
        char[] ch= tochar(arr);
        for(int j=0;j<ch.length;j++){
            System.out.println(ch[j]);
        }

    }

}
