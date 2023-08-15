public class Pr12 {
    public static void main(String[] args) {
        String str="mountain";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    char ch= str.charAt(k);
                    System.out.print(ch);
                }
                System.out.println();
            }

        }
    }
}