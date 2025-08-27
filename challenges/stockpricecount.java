

public class stockpricecount {

    public static void stockprice(int [] arr){
        int count =0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<arr[i]) {
                count = count+1;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int []arr={5,6,4,5,2,3,4,3};
        stockprice(arr);
    }
}
