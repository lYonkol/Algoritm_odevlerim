/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Random;
import java.util.Scanner;
public class odev5 {
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    Random r=new Random(); //random sınıfı
     int a=r.nextInt(26)+96;
     char harf = (char)a;
    for (int i = 0; i < 10; ) {
    System.out.println("lütfen harfi tahmin ediniz");
    int girilensayi = input.nextInt();
     
    if(harf==girilensayi){
    System.out.println("doğru bildiniz"); 
    i=10;
    }
    
    else  {
    System.out.println("yanlış girdiniz");  
    }
    }
}}