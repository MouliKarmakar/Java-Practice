import java.util.ArrayList;
public class Pr4 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>arr1=new ArrayList<>();
        for(int value:arr){
            arr1.add(value);
        }
        int min=arr1.get(0);
        for(int i=0;i<arr.length;i++){
            if(arr1.get(i)<min){
                min=arr1.get(i);
            }
        }
        System.out.print(min);
    }
}