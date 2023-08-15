public class Pr10 {
    public static void main(String[] args) {
        int N=97420;
        String str= Integer.toString(N);

        if(str.contains("420")){
            System.out.println("Caught");
        }
        else{
            System.out.println("Escaped");
        }
    }
}