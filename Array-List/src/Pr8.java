import java.util.ArrayList;
public class Pr8 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>new_arr= new ArrayList<>();
        for(int num:arr){
            new_arr.add(num);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+new_arr.get(i);
        }
        int average=sum/arr.length;
        System.out.print(average);
    }
}