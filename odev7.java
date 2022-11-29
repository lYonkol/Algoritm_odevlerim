
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev7{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen x açısını giriniz");
    int x = input.nextInt();
     System.out.println("lütfen kaça kadar açılcağını giriniz");
    int n = input.nextInt();
    int a=1;
    double toplam=0;
    double fak=1;
    int genelx=1;
    
        for (int i = 1; i <= n; i++) {
           toplam+=1+x/n ;
          
           
            
        }
        System.out.println("limit binom açılımı "+toplam);
   
}}
