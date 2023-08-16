import java.util.ArrayList;
public class Pr13 {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        int[]B={6,7,8,9,10};
        ArrayList<Integer>arr1= new ArrayList<>();
        for(int num1:A){
            arr1.add(num1);
        }
        ArrayList<Integer>arr2= new ArrayList<>();
        for(int num2:B){
            arr2.add(num2);
        }
        int prime1=0;
        int prime2=0;
        for(int i=0;i<A.length;i++){
            int count1=0;
            for(int j=1;j<=arr1.get(i);j++){
                if(arr1.get(i)%j==0){
                    count1++;
                }
            }
            if(count1==2){
                prime1=prime1+arr1.get(i);
            }
        }
        for(int k=0;k<B.length;k++){
            int count2=0;
            for(int l=1;l<=arr2.get(k);l++){
                if(arr2.get(k)%l==0){
                    count2++;
                }
            }
            if(count2==2){
                prime2=prime2+arr2.get(k);
            }
        }
        int sum=prime1+prime2;
        System.out.println(sum);
    }
}