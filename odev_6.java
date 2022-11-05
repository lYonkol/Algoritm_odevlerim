/*
1.adım Başla
2.adım Kullanıcıdan bir adet sayı al 
3.adım 1den saymaya başla
4.adım Eğer n<=saymaya başlanan sayı ise  adım 7 ye git
5.adım saymaya başlanana sayıların karesini al 
6.adım karelerin toplamı=karelin toplamı+saymaya başlanaan sayının karesi
7.adım karelerinin sonucunu ekrana bastır 
8.adım bitir 
*/










import java.util.Scanner;
public class odev_6 {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Lutfen bir sayi giriniz");
     int a = input.nextInt();
     int kare_toplam = 0;
     while(a>=0){
         kare_toplam=kare_toplam+a*a;
         a--;
     }
     System.out.println(kare_toplam);
     
    }
    
}
