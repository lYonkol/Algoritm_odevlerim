/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev3{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen ln değerini giriniz");
    int n = input.nextInt();
     
    double toplam=1;
   
   
        for (int i = 1; i <= n-1; i++) {
            toplam=toplam+1/((2*i)*(2*i+2));
        }
        System.out.println("ln açılım sonucu "+toplam);
   
}}

