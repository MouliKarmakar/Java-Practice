public class Pr11 {
    public static void main(String[] args) {
        int N=5;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i==1||j==1||j==N){
                    System.out.print("* ");
                }
                else if(j!=1||j!=N){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}