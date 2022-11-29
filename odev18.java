/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Random;
    import java.util.Scanner;
    public class odev18{    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);  
     System.out.println("lütfen kaça kadar açılcağını giriniz");
    int n = input.nextInt();
    boolean asal=true;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    asal=false;
                }
               
            }
            if (asal==true) {
                   System.out.print(i+"-");
                }
            asal=true;
        } 
}}

