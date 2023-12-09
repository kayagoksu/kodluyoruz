import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika")) {
            if (password.equals("java123")) {
                System.out.println("Giriş yaptınız !");
            } else {
                System.out.println("Şifreniz yanlış ! Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
                select = input.nextLine();
                if(select.equals("1")) {
                    System.out.print("Şifrenizi oluşturunuz : ");
                    password = input.nextLine();
                    if(password.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
            }
        } else {
            System.out.println("Bilgileriniz yanlış !");
        }
    }
}

