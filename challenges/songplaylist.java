

public class songplaylist {

    public static void favorateSong(String str, int k){

        char [] ch =str.toCharArray();

        int maxcount=0;

        for (int i = 0; i <=ch.length-k; i++) {

            for (int j = i; j <= i+k-1; j++) {
                System.out.print(ch[j]);
                
            }
            System.out.println();
            
        }

    }



    public static void main(String[] args) {
        String str = "Abcaca";
        int k=3;
        favorateSong(str,k);


    }

    
}
