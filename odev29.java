/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev29{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("lütfen sayısı giriniz");
    int x= input.nextInt();
    System.out.println("lütfen sayısı giriniz");
    int y= input.nextInt();
     
    int toplam=1;
        int toplam2=1;
   
        for (int i = 1; i < x; i++) {
            if (x%i==0) {
                toplam+=i;
            }
      
        } 
         for (int t = 1; t < x; t++) {
            if (x%t==0) {
                toplam2+=t;
            }
      
        } 
         if (toplam==y && toplam2==x) {
            System.out.println("dost sayılardır"); 
        }
         else{
          System.out.println("dost sayılar değildir");}
        

}}
