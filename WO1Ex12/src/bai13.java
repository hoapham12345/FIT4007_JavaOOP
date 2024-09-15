import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        int tong=0;
        //input
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập 1 số: ");
        //process
        int command_line = input.nextInt();
        for (int i=1;i<=command_line;i++){
            tong+=i;
        }
        //ouput
        System.out.printf("Tổng các số từ 1 đến "+command_line+" là: "+tong);

    }
}
