/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev32{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen değer giriniz");
    int x = input.nextInt();
  int toplam=0;
        for (int i = 0; i <= x; i++) {
            if (x%i==0) {
                toplam=toplam+i;
            }
        }
        if (toplam<2*x) {
            
               System.out.println("eksik sayıdır"); 
        }
        else{System.out.println("eksik sayı değildir"); }
   
}}
