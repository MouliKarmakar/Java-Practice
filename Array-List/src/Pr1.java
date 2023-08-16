import java.util.ArrayList;
public class Pr1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>new_arr= new ArrayList<>();
        for(int num:arr){
            new_arr.add(num);
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(new_arr.get(i)+" ");
        }

    }
}