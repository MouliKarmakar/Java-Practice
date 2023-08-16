import java.util.ArrayList;
public class Pr14 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        ArrayList<Integer>A= new ArrayList<>();
        for(int s:arr){
            A.add(s);
        }

        if(A.get(0)>A.get(1)){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }

        for(int i=1;i<arr.length-1;i++){
            if(A.get(i)>A.get(i-1)&&A.get(i)>A.get(i+1)){
                System.out.print(2+" ");
            }
            else if(A.get(i)>A.get(i-1)||A.get(i)>A.get(i+1)){
                System.out.print(1+" ");
            }
            else{
                System.out.print(0+" ");
            }

        }

        if(A.get(arr.length-1)>A.get(arr.length-2)){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }
        System.out.println();
    }
}