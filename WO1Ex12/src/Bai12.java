public class Bai12 {
    public static void main(String[] args) {
        //input
        //process
        int tong=0;
        for (int i =0;i<=100;i++){
            if (i%7 ==0){
                //ouput
                System.out.println(i);
                tong+=i;
            }

        }
        System.out.printf("Tổng các bội số của 7 từ 1 đến 100 là:" +tong);
    }
}
