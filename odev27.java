/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev27{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("lütfen 1 den büyük x sayısı giriniz");
    int x= input.nextInt();
     System.out.println("lütfen 1 den büyük y sayısı giriniz");
    int y= input.nextInt();
    int toplam=1;
     int j = 1;
        for (int i = 1; i <= y; i++) {
        x*=x;
      for ( ;j <= i ; j++) {
            y*=y;
            System.out.println(x+y);
        }
      
        } 
       
          
        
     
       
        

}}

