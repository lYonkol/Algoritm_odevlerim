/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7odevler;

/**
 *
 * @author oyunt
 */
 import java.util.Random;
import java.util.Scanner;
public class odev10 {
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
   
   
    System.out.println("lütfen harfi tahmin ediniz");
    int n = input.nextInt();
    int c=1;
    
        for (int i = 1; i < n; i++) {
             int c1=4*i*i;
            c=c*c1/(c1-1);
        }
       System.out.println("john wallis gösterimi"+2*c);
}}