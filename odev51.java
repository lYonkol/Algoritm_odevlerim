/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev51{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int a=1;
      
       
     
        for (int i = 1; i <= x; i++) { 
            for (int j = 2; j <= i; j++) {
              System.out.print(a+" ");  
              a++;
            }
            System.out.println(); 
            
        }
        
}}