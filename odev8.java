/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Random;
import java.util.Scanner;
public class odev8 {
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
     System.out.println("lütfen terim sayısını giriniz");
    int n = input.nextInt();
    int t =2;
    int f=1;
    for (int i = 1; i < n;i++ ) {
       
            
            f*=2*i+1;
          
        
   
       t=t+(2*i+2)/f;
    }
     System.out.println("Brothers formülüne göre değerin sonucu= "+t);
}}
