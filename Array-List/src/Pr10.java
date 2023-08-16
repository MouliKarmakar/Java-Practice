import java.util.ArrayList;
public class Pr10 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int k=4;
        ArrayList<Integer>arr1= new ArrayList<>();
        for(int s:arr){
            arr1.add(s);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr1.get(i)%2==0){
                count++;
            }
        }
        if(count>k){
            System.out.println("Nice Array");
        }
        else{
            System.out.println("Bad Array");
        }
    }
}