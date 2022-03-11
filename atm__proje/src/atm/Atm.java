package atm;
import java.util.Scanner;
public class Atm {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String userName,password;

        int right=3;
        int balance=1500;
        int select;
        while (right > 0) {

            System.out.println("Kullanıcı adınız:");
            userName=input.nextLine();
            System.out.println("Şifreniz:");
            password=input.nextLine();
            if(userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Sisteme giriş yaptınız.");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
                System.out.println(
                        "1-Para yatırma\n"+
                        "2-Para çekme\n"+
                        "3-Bakiye sorgulama\n"+
                        "4-Cikis yap");
                select=input.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Para miktarı:");
                        int price=input.nextInt();
                        balance+=price;
                        System.out.println("Hesabınızdaki yeni para miktarı:"+balance);

                        break;
                    case 2:
                        System.out.println("Para miktarı:");
                        int price2=input.nextInt();
                        if(price2>balance){
                            System.out.println("Bakiye yetersiz");
                        }
                        else{
                            balance-=price2;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz:"+balance);
                        System.out.println("Hesabınızdaki yeni para miktarı:"+balance);
                        break;
                    case 4:
                        System.out.println("Tekrardan görüşmek üzere");
                        break;
                }
                break;
            }
            else
            {
                right--;
                System.out.println("Hatalı kullanıcı veya şifre.Tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz");
                }
                System.out.println("Kalan hakkınız:"+right);
            }
        }



    }
}
