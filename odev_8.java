/*
1.adım başla
2.adım Kullancıdan x degeri al 
3.adım Kullanıcıdan alınan x değerini x^2-5x+3fonksiyonunda yerine koy
4.adım Eğer verilen x değeri fonksiyona konulduğunda poztifse ekrana poztif yazdır
5.adım Sonuç negatif çıkıyorsa ekrana negatif yazdır 
6.adım Eğer 0 çıkıorsa ekran 0yazdır 
7.adım Bitir
*/

import java.util.Scanner;
public class odev_8 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen x'2-5x+3 fonkisyonu için bir degeri giriniz");
        double x =input.nextDouble();
        double sonuc= (x*x)-(5*x)+3;
        if (sonuc<0){
            System.out.println("Girdiginiz değere göre sonucunuz negatif çıkmaktatır");
        }
        else if (sonuc>0){
            System.out.println("Girdiğiniz değere göre sonucunuz pozitif çıkmaktadır");
        }
        else{
            System.out.println("Girdiğiniz değerde sonucunuz 0 çıkmaktadır");
        }
                
        
    }
    
}
