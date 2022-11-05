/*
1.adım başla
2.adım Kullanıcıdan bir n sayısı al
3.adım Kullanıcıdan alınan n sayısını a sayısına eşitlle
4.adım a sayısınu 10 böl ve çıkan basamağı tut 
5.adım eğer a sayısı daha fazla 10 bölünemiyorsa durdur
6.adım tutulan basamakları ters çevirip ekrana yazdır
7.adım bitir
*/


import java.util.Scanner;
public class odev_9 {

   
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Lutfen bir sayı giriniz");
       int a = input.nextInt();
       int k=a;
       while(k>0){
         System.out.print(k%10);
         k=k/10;
       }
       
    }
    
}
