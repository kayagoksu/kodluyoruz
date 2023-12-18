import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = input.nextInt();

        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Lütfen geçerli değerler giriniz !");
        } else {
            // Alternatif
            if (month == 1) {
                if (day < 22) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            } else if (month == 2) {
                if (day < 20) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
            } else if (month == 3) {
                if (day < 21) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            } else if (month == 4) {
                if (day < 21) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            } else if (month == 5) {
                if (day < 22) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
            } else if (month == 6) {
                if (day < 23) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            } else if (month == 7) {
                if (day < 23) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            } else if (month == 8) {
                if (day < 23) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            } else if (month == 9) {
                if (day < 23) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            } else if (month == 10) {
                if (day < 23) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            } else if (month == 11) {
                if (day < 22) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            } else if (month == 12) {
                if (day < 22) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
            }
        }

        /*switch (month) {
            case 1:
                if(day<22) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            case 2:
                if(day<20) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
            case 3:
                if(day<21) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            case 4:
                if(day<21) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            case 5:
                if(day<22) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
            case 6:
                if(day<23) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            case 7:
                if(day<23) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            case 8:
                if(day<23) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            case 9:
                if(day<23) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            case 10:
                if(day<23) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            case 11:
                if(day<22) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            case 12:
                if(day<22) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
        }*/

    }
}

