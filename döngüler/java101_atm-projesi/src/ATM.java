import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, select, balance = 1500, price = 0;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgulama\n" +
                                    "4-Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                            price = input.nextInt();
                            if (price > 0) {
                                balance += price;
                                System.out.println("İşlem başarıyla gerçekleşmiştir. Yeni bakiyeniz : " + balance);
                            } else {
                                System.out.println("Yanlış değer girdiniz!");
                            }
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                            price = input.nextInt();
                            if (price > 0) {
                                if (price < balance) {
                                    balance -= price;
                                    System.out.println("İşlem başarıyla gerçekleşmiştir. Yeni bakiyeniz : " + balance);
                                } else {
                                    System.out.println("Bakiyeniz yetersiz !");
                                }
                            } else {
                                System.out.println("Yanlış değer girdiniz!");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while ((select == 1) || (select == 2) || (select == 3));
                System.out.println("Tekrar görüşmek üzere !");
                break;

                /*do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgulama\n" +
                                    "4-Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    if (select == 1) {
                        System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                        price = input.nextInt();
                        if (price > 0) {
                            balance += price;
                            System.out.println("İşlem başarıyla gerçekleşmiştir. Yeni bakiyeniz : " + balance);
                        } else {
                            System.out.println("Yanlış değer girdiniz!");
                        }
                    } else if (select == 2) {
                        System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                        price = input.nextInt();
                        if (price > 0) {
                            if (price < balance) {
                                balance -= price;
                                System.out.println("İşlem başarıyla gerçekleşmiştir. Yeni bakiyeniz : " + balance);
                            } else {
                                System.out.println("Bakiyeniz yetersiz !");
                            }
                        } else {
                            System.out.println("Yanlış değer girdiniz!");
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere !");
                break;*/

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }

    }
}

