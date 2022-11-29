/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Random;
import java.util.Scanner;
public class odev4 {
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    Random r=new Random(); //random sınıfı
     int a=r.nextInt(100);
    for (int i = 0; i < 10; ) {
    System.out.println("lütfen sayıyı tahmin ediniz");
    int girilensayi = input.nextInt();
     
    if(a==girilensayi){
    System.out.println("doğru bildiniz"); 
    i=10;
    }
    else if (a>girilensayi){
    System.out.println("sayınız küçük tekrar girin");  
    }
    else  if(a<girilensayi){
    System.out.println("sayınız büyük tekrar girin");  
    }
    }
}}
