

public class nCr {

    public static int binomicalCoff(int n, int r ){
        int nr= n-r;
        int ans1 =1;
        int ans2=1;
        int ans3=1;

        for (int i = 0; i < n; i++) {
            ans1 = ans1*(n-i);    
        }
        for (int i = 0; i < r; i++) {
            ans2=ans2*(r-i);         
        }
        for (int i = 0; i < nr; i++) {
            ans3=ans3*(nr-i);     
        }

        int finalans= ans1/(ans2*ans3);
        return finalans;
        
    }

    public static void main(String[] args) {
        int n=12;
        int r=7;
        int fans = binomicalCoff(n, r);
        System.out.println(fans);

    }
    
}
