public class Pr9 {
    public static void main(String[] args) {
        String str="mountain";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
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