public class Pr11 {
    public static void main(String[] args) {
        String str= "MasaiSchool";
        StringBuilder sb=new StringBuilder(str);
        int count=0;
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);

    }
}