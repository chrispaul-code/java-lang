

public class magicalcount {
    public static void magicalCount(int n){

        int magicalCount=0;

        for (int i = 1; i <=n; i++) {
            String str = Integer.toBinaryString(i);

            StringBuilder str1 = new StringBuilder();
            
            char [] ch=str.toCharArray();
            for (int j = 0; j < ch.length; j++) {

                if (ch[j]=='0') {
                    str1.append('1');
                    
                }else{
                    str1.append('2');
                }
            }
                
                char [] ch2=str1.toString().toCharArray();
                int sum=0;
                for (int j2 = 0; j2 < ch2.length; j2++) {
                    sum=sum+Character.getNumericValue(ch2[j2]);
                    
                }

                if (sum%2 !=0) {
                    magicalCount=magicalCount+1;
                    
                }
            
        }

        System.out.println(magicalCount);

    }


    public static void main(String[] args) {
        int n=5;
        magicalCount(n);

    }
    
}
