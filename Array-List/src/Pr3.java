import java.util.ArrayList;
public class Pr3 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>new_arr=new ArrayList<>();
        for(int value:arr){
            new_arr.add(value);
        }
        int max=new_arr.get(0);
        for(int i=0;i<arr.length;i++){
            if(new_arr.get(i)>max){
                max=new_arr.get(i);
            }
        }
        System.out.println(max);
    }
}