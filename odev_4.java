/*
1. adım başla 
2.adım Kullıcıdan bir sayı al
3.adım Sayının tek mi çift mi olduğunu kontrol et 
4.adım Eğer sayı çiftse bir azını al ve n>sayılan tek sayılıar olana kadar topla değer saglanıyorsa adım 7.adıma  git
5.adım Eger sayı tekse n>sayılan tek sayılar  olana kadar topla değer adıma 7.adıma git
6.adım toplam =toplam+tek sayılar
7.adım değeri ekrana yazdır
8.adım bitir
 */

import java.util.Scanner;

public class odev_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int n = input.nextInt();
        int b = n % 2;
        int toplam = 0;
        if (b == 0) {
            n -= 1;
            while (n >= 0) {
                toplam = toplam + n;
                n -= 2;

            }
            System.out.println(toplam);
        } else if (b != 0) {
            while (n >= 0) {
                toplam = toplam + n;
                n -= 2;

            }
            System.out.println(toplam);
        }
    }
