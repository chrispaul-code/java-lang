import java.util.HashSet;

public class demo {

    // public static void main(String[] args) {
    //     String str = "ch    //////      ris pau l";

    //     char[] ArrStr = str.toCharArray();
        
    //     for (int i = 0; i < ArrStr.length; i++) {

    //         if (ArrStr[i]== ' ' || ArrStr[i]== '/') {
    //             continue;
                
    //         }else{
    //             System.out.print(ArrStr[i]);
    //         }
            
    //     }
    // }

    public static void main(String[] args){

        int arr1[]={1,5,10,20,30};
        int arr2[]={5,13,15,20,30};
        int arr3[]={5,20};

        HashSet<Integer> set1 = new HashSet<>();
        for(int val : arr1){
            set1.add(val);
        }

        for(int val : arr2){
            if(set1.contains(val)){
                 
            }

        }
    
    
    }
    
}
