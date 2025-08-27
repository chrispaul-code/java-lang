


public class countString {

    public static void contOfChar(String str , int n, char ch){

        char[] chr=str.toCharArray();


      int count = 0;


    for (int i = 0; i < n; i++) {
        if (chr[i]==ch) {
            count++;
        }
        
    }


    System.out.println(count);
    }






    public static void main(String[] args) {
         String str= "helloworld";
         int n=10;
         char ch='l';
         contOfChar(str, n, ch);
    }
    
}
