/*
1.adım başla 
2.adım Kullanıcıdan bir n sayısı al
3.adım a=0 ve b=0 olmak üzere iki sayı tanımla
4.adım a ve b sayısı n e eşit olana kadar  n=a^2+b^2 denkleminin sağlanıp sağlanmadıpını kontrol et
5.adım eğer n=a^2+b^2  yazılabiliyorsa ekran yazdır
6.adım sağlamıyorsa yazılamıyor olarak ekrana yazdır
7.adım bitir
*/
import java.util.Scanner;

public class odev_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int a = input.nextInt();
        boolean kontrol = false;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (a == i * i + j * j) {
                   kontrol = true;

                }

            }

        }
        if(kontrol){
             System.out.println("Girdiginiz sayı a=b^2+c^2 seklinde yazılabiliyor");
        }
        else{
             System.out.println("Girdiginiz sayı a=b^2+c^2 seklinde yazılamıyor");
        }

    }

}
