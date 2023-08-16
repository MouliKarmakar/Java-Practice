import java.util.ArrayList;
public class Pr6 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>arr1= new ArrayList<>();
        for(int s:arr){
            arr1.add(s);
        }
        for(int i=0;i<arr.length;i++){
            if(arr1.get(i)%2!=0){
                System.out.println(arr1.get(i));
            }
        }
    }
}