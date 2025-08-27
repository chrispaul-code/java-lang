public class HalloweenCandies {

    
    public static void main(String args[]){

        int[] arr = {4, 5, 7, 2, 15, 20};
        int count = 0;
        int n=6;

        for (int i=0;i<=n-1;i++) {
            if (arr[i]% 5 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    
}
