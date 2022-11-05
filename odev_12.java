/*
1.adım başla
2.adım Kullanıcıdan bir n sayısı al n>7 olacak şekilde
3.adım a=0 b=0 olmak üzere iki sayı tanımla ve bu sayılar n e eşit olana kadar n=5*a+3*b denklemini sağlayıp sağlamadığını kontrol et
4.adım eğer denklem herhangi ikili için sağlanıyorsa ekrana 3ve5in tam katı olarak yazıbilir yazdır
5.adım sağlamıyorsa yazılamıyor olarak ekrana yazdır
6.adım bitir 
 */

import java.util.Scanner;

public class odev_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz(7den büyük)");
        int a = input.nextInt();
        if (a < 7) {
            System.out.println("7den kucuk bir sayi girdiniz");
            System.exit(0);
        }
        boolean kontrol = false;

        for (int i = 0; i < a; i += 5) {
            for (int j = 0; j < a; j += 3) {
                if (a == i + j) {
                    kontrol = true;

                }

            }

        }
        if (kontrol == true) {
            System.out.println("Girdiginiz sayi 3un ve 5in katları seklinde yazilabiliyor ");

        } else {
            System.out.println("Girdiginiz sayi 3un ve 5in katları seklinde yazilamıyor");
        }
    }

}
