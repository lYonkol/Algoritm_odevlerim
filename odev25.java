/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev25{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("sayıyı giriniz");
    int u= input.nextInt();
    int toplam=1;
    int deger=2;
        for (int i = 1; i <= u; i++) {
            for (int j = 1; j < i; j++) {
              deger*=2;
            }
       System.out.println(i+"değerinin cullen değeri="+(toplam = i*deger+1));
         
        }
      

}}
