/*
1.adım başla
2.adım kullanıcıdan sayı al 
3.adım s=1
4.adım eğer n<s ise adım 6ya git 
5.adım değilse faktoriyel=faktoriyel*s ve s=s+1
6.adım kombinasyon yapılacak ikinci sayıyı al 
7.adım kombinasyonu yapılacak sayıların faktoriyelini bul
8.adım kombinasyon = n!/r!(n-r)! formülünü kullanarak alınan iki sayının kombinasyonunu bul
9.adım bulunan kombinasyon değerini ekrana yazdır
10.adım bitir
.
 */

import java.util.Scanner;

public class odev_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kombinasyonu alınacak iki sayı giriniz");
        int n = input.nextInt();
        int r = input.nextInt();
        int nfak = 0;
        int rfak = 0;
        int farkfak = 0;
        for (int i = 1; i <= n; i++) {
            nfak = n * i;

        }
        for (int i = 1; i <= r; i++) {
            rfak = r * i;

        }
        for (int i = 1; i <= (n - r); i++) {
            farkfak = (n - r) * i;

        }

        int kombinasyon = nfak / rfak * farkfak;
        System.out.println(kombinasyon);
    }

}
