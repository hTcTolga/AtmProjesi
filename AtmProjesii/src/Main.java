import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right =3;
        int select,price,balance =2000;
        while (right > 0){
            System.out.print("Kullanıcı Adını Giriniz: ");
            username = input.nextLine();
            System.out.print("şifrenizi Giriniz: ");
            password = input.nextLine();
            if (username.equals("tolga") && password.equals("123")){
                System.out.print("HtC-Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seciniz: \n1-Para Yatırma " +
                            "\n2-Para Çekme " +
                            "\n3-Bakiye Sorgulama" +
                            "\n4-Çıkış");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak Para Miktarı:  ");
                            price=input.nextInt();
                            balance += price;
                            System.out.println("Güncel Bakiyeniz: "+ balance);
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarı: ");
                            price=input.nextInt();
                            if (balance>price){
                                balance -= price;
                                System.out.println("Güncel Bakiyeniz: "+balance);
                            }
                            else {
                                System.out.println("Bakiyeniz Yetersiz.");
                            }
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz: "+balance);
                            break;
                    }
                }while (select != 4);
                    System.out.println("Hesabınızdan Çıkış Yapıldı.");
                    break;
            }else {
                right--;
                System.out.println("Kullanıcı Adınızı veya Şifrenizi Yanlış Girdiniz:");
                System.out.println("Kalan Hakkınız: "+right);
                if (right == 0){
                    System.out.print("Hesabınız Bloke Olmuştur.En Yakın Bankaya Gitmeniz Gerekmektedir.");
                }else {
                    System.out.println("Lütfen Tekrar Deneyiniz!");
                }
            }
        }
    }
}
