import java.util.Scanner;
public class two {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        int i = 0;
        double zj = 0;
        System.out.println("请输入存款金额（1000起存）");
        int je = scan.nextInt();
        System.out.println("请输入存款年限（四选一）");
        int nx = scan.nextInt();

            switch(i)
            {
                case '1':
                    zj=je+je*2.25;
                    break;

                case '2':
                    zj=je+je*2.7;
                    break;

                case '3':
                    zj=je+je*3.25;
                    break;

                case '5':
                    zj=je+je*3.6;
                    break;

            }
        System.out.println("收入总金额为："+ zj);


    }
}
