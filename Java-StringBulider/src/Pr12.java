public class Pr12 {
    public static void main(String[] args) {
        String str= "Masai";
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    char ch=sb.charAt(k);
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}