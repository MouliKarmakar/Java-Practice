public class Pr10 {
    public static void main(String[] args) {
        int N=97420;
        String str = Integer.toString(N);
        StringBuilder sb = new StringBuilder(str);
        if(sb.indexOf("420") != -1){
            System.out.println("Caught");
        }
        else{
            System.out.println("Escaped");
        }
    }
}