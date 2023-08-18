public class Pr9 {
    public static void main(String[] args) {
        String str= "Masai School";
        StringBuilder sb=new StringBuilder(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=sb.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        if(count>=str.length()/2){
            System.out.println("Feel good!");
        }
        else{
            System.out.println("Feel bad!");
        }
    }
}