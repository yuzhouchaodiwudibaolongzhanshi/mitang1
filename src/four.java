import java.util.Scanner;
public class four {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入你的工资：");
        double shouru =scan.nextInt();
        double wuxianh=shouru-shouru*0.1;
        double shui=0;
        if(wuxianh<5000) {

        }
            else
                if(wuxianh<=8000)
                {
                    shui=(wuxianh-5000)*0.03;
                    wuxianh=wuxianh-shui;
                }
                   else
                       if(wuxianh<=17000)
                       {
                           shui=(wuxianh-8000)*0.1+90;
                           wuxianh=wuxianh-shui;
                       }
                       else
                           if(wuxianh<=30000)
                           {
                               shui=(wuxianh-17000)*0.2+990;
                               wuxianh=wuxianh-shui;
                           }
                           else
                               if(wuxianh<=40000)
                               {
                                   shui=(wuxianh-30000)*0.25+3590;
                                   wuxianh=wuxianh-shui;
                               }
                               else
                                   if(wuxianh<=60000)
                                   {
                                       shui=(wuxianh-40000)*0.3+6090;
                                       wuxianh=wuxianh-shui;
                                   }
                                   else
                                       if(wuxianh<=85000)
                                       {
                                           shui=(wuxianh-60000)*0.35+12090;
                                           wuxianh=wuxianh-shui;
                                       }
                                       else
                                       {
                                           shui=(wuxianh-85000)*0.45+20840;
                                           wuxianh=wuxianh-shui;
                                       }

        System.out.println("你的税收是："+shui);
        System.out.println("你的工资是："+wuxianh);
    }
}
