
public class space {

    public static void countSpace(String str1, String str2){

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        int count1 =0;
        int count2=0;

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i]==' ') {
                count1=count1+1;   
            }  
        }

        for (int i = 0; i < ch2.length; i++) {
            if (ch2[i]==' ') {
                count2=count2+1;
            }   
        }

        // System.out.println(count1);
        // System.out.println(count2);

        int count = Math.abs(count2-count1);

        if (count%2==0) {
            System.out.println("Even"+count);
            
        }else{
            System.out.println("Odd"+count);
        }

    }


    public static void main(String[] args) {
        String str1="M icrowav e,,,, Mic ro w a v e";
        String str2="Kuch bhi dal";
        countSpace(str1, str2);

    }
    
}
