public class five {
    public static void main(String []args)
    {
        int zong=0;
        int ru=3;
        int time=0;
        while(zong !=10)
        {
           zong=time-ru;
           time++;
           if(zong<0)
               zong=0;
        }
        System.out.println("经过"+time+"分钟后，会满");
    }
}
