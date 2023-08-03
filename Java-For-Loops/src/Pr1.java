public class Pr1 {
        public static void main(String[] args) {
//            for(int i=1;i<=10;i++){
//                System.out.println(i);
//        }

            int sum=0;
            for(int i=1;i<=3;i++){
                for(int j=1;j<=3;j++){
                    sum -=(i*j)-i;
                }
            }
            System.out.println(sum);
    }
}
