import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {
        int tong_chan=0;
        int tong_le=0;
        //input
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập 1 số: ");
        int command_line = input.nextInt();
        //process
            for(int i=0;i<=command_line;i++){

                if(i%2 ==0){
                    tong_chan+=i;
                }
                if(i%2!=0){
                    tong_le+=i;}}
            //output
        if(command_line%2==0){
            System.out.printf("Tổng các số chẵn từ 0 tới "+command_line+" là: "+tong_chan);
        }
        else{
            System.out.printf("Tổng các số lẻ từ 0 tới "+command_line+" là: "+tong_le);
        }

        }
    }
