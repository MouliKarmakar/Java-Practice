public class Pr11 {
    public static void main(String[] args) {
        String str="mountain";
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}