public class Pr10 {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==num||i==1||j==num){
                    System.out.print("* ");
                }
                else if(i!=1||i!=num){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}