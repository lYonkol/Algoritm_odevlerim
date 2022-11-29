/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev37{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        double sayac=0;
        int s=0;
        double toplam=0;
        for (int i = 1; i <= x; i++) {
           
            if (x%i==0) {
                 
                 sayac=sayac+i;
                   s++;   
            }  
        }
        toplam=sayac/s;
        for (int i = 1; i <= x; i++) {
            if (toplam==i) {
                 System.out.println(x+" aritmatik sayısıdır");
            }
        }
}}