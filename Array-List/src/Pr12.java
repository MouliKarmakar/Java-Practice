import java.util.ArrayList;
public class Pr12 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>new_arr= new ArrayList<>();
        for(int num:arr){
            new_arr.add(num);
        }
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++){
            if(new_arr.get(i)==0){
                zero++;
            }
            else if(new_arr.get(i)==1){
                one++;
            }
            else if(new_arr.get(i)==2){
                two++;
            }
        }
        System.out.println(zero+" "+one+" "+two);
    }
}