package Interview;

public class Question1 {
    public static void main(String[] args) {
        int[] arr={3,3,1,1};

        int n=arr.length-1;

        int min= arr[0];
        int max= arr[n];

        int countmin=0;
        int countmax=0;

        int sum=0;

        for (int i = 0; i <= n; i++) {
            if(arr[i]>max ){
               max=arr[i] ;
               countmax=1;
            } else if (arr[i]==max) {
                countmax++;
            }
            if(arr[i]<min ){
                min=arr[i];
                countmin=1;

            } else if (arr[i]==min) {
                countmin++;
            }


            sum=sum+arr[i];


        }

        float avg = sum-((min*countmin)+(max*countmax));

        float ans = (avg/(arr.length -( countmax+countmin)));

        System.out.println(min);
        System.out.println(max);
        System.out.println(countmax);
        System.out.println(countmin);

        System.out.println(ans);
    }
}
