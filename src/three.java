import java.util.Scanner;
public class three {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入行数：");
        int x = scan.nextInt();
        int[][] yh=new int[x][x];
        for(int i=0;i<yh.length;i++)
        {
            yh[i][0]=1;
            yh[i][i]=1;
        }
        for(int i=2;i<yh.length;i++)
        {
           for(int j=1;j<i;j++)
           {
               yh[i][j]=yh[i-1][j-1]+yh[i-1][j];

           }
        }
        for(int i=0;i<yh.length;i++)
        {
            for(int y=0;y<yh.length-1;y++)
            {
                System.out.println("*");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.println(yh[i][j]);
            }
            System.out.println("*");
        }

    }
}
