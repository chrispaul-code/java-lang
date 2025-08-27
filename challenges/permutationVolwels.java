

public class permutationVolwels {

    public static void countVowels(String str){

        char[] ch=str.toCharArray();
        int count =0;
        int result =1;
        System.out.println();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ) {
                continue;

            }else{
                count ++;
            }
            
        }

        System.out.println(count);

        for (int i = count; i >= 1; i--) {
            result=result*i;
            
        }

        System.out.println(result);

    }




    public static void main(String[] args) {
        String str="ABCAB";
        countVowels(str);

    }
    
}
