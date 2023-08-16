import java.util.ArrayList;
public class Pr2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>new_arr= new ArrayList<>();
        for (int value : arr) {
            new_arr.add(value);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(new_arr.get(i));
        }

    }
}