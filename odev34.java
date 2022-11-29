/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev34{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int sayac=0;
        for (int i = 1; i <= x; i++) {
           
            System.out.println(i*(i+1)+"bir heterometrik sayısıdır");
           
        }
       
        
   
}}
