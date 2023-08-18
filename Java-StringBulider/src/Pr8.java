public class Pr8 {
    public static void main(String[] args) {
        String str= "MasaiSchool";
        StringBuilder sb1 =new StringBuilder(str);
        StringBuilder sb2 =new StringBuilder();
        StringBuilder sb3 =new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=sb1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sb2.append(ch);
            }
            else{
                sb3.append(ch);
            }
        }
        System.out.println(sb2);
        System.out.println(sb3);
    }
}