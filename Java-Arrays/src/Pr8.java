public class Pr8 {
    public static void main(String[] args) {
        int zero=0;
        int one=0;
        int two=0;
        int[]arr={0,1,1,2,0,2,1};
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else if(arr[i]==2){
                two++;
            }
        }
        System.out.println(zero+" "+one+" "+two);
    }
}