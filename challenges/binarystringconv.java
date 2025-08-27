

public class binarystringconv {
    public static void main(String[] args) {
        String s1="0C1A1B1C1C1B0A0";

        char[] chr=s1.toCharArray();

        int result=chr[0]-'0';

        for (int i = 0; i < chr.length; i++) {
            if (chr[i]=='A') {
                result=result&(chr[i+1]-'0'); 
            }else if (chr[i]=='B') {
                result=result|(chr[i+1]-'0'); 
            }else if (chr[i]=='C') {
                result=result^(chr[i+1]-'0'); 
            }
        }
        System.out.println(result);
    }
}
