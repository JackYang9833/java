import java.beans.Customizer;
import java.util.Date;
import java.util.Scanner;

/*
*
* 需求：根据输入图书编号选购所需要的书，并且显示书的信息（书名、价格、编号、库存）。购买成功后打印订单信息（订单号、订单日期，订单总额）
* */
public class BookStore{
    public static void main(String[] args) {
       do{ Customer();}while(true);
    }

    public static void Customer(){
        String name[]=new String[]{"《狂人日记》","《傲慢与偏见》","《C Primer Plus》","《Java基础案例教程》","《LSP是怎样养成的》"};
        double price[]=new double[]{30.0,22.5,65.0,59.80,9.9};
        int num_of_books[]=new int[]{10,9,30,55,100};
        int i;
        double money = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("******** XXX图书馆自动销售系统 *********");
        System.out.println("******** XXX-Library-Automatic-Selling-System *********");

        for (i = 0; i < name.length; ++i) {
            System.out.println((i + 1) + ". " + name[i] + "单价" + price[i] + "/本" + "------库存" + num_of_books[i] + "本");
        }
        do {
            i=0;
            System.out.print("\n请输入编号选购 (输入0结算)>> ");
            int num = input.nextInt();
            if (num == 0) {
                System.out.print("\n购买成功！正在为您打印发票... ");
                delay(3000);
                System.out.print("\n发票打印成功！");
                infTicket(money,name[num],num,name[num],price[num]);
            }
            System.out.print("\n请输入购买数量>> "+i);
            int most = input.nextInt();
            if (most>num_of_books[i]){
                System.out.print("\n拿不出>> ");
            }
            money+=price[i]*most;
            i++;
        }while (true);
    }
    public static void delay(int ms){
        for (int x=ms;x>0;x--)
            for (int y=110;y>0;y--);
    }
    public static void infTicket(double money,String book,int n,String bkNm,double per){
        Date dt=new Date();
        System.out.println("******** XXX收据 *********");
        System.out.println("交易日期："+dt.getYear()+"-"+dt.getMonth()+"-"+dt.getDay());
        System.out.println("品名"+bkNm+"--"+"单价："+per);
        System.out.println("数量："+n);
        System.out.println("总额："+money);
        System.out.println(book);
    }
}