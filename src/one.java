public class one {
    public static void main(String args[]){
        int newphone=7988;
        int oldphone=1500;
        double i;
        double j;
        i=newphone-oldphone;
        j=newphone*0.8;
        System.out.println("最便宜的方式是"+"\t");
        if(i<j)
            System.out.println("卖给二手市场");
        else
            System.out.println("以旧换新");
    }
}
