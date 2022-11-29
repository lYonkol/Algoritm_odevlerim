/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Random;
import java.util.Scanner;
public class odev9 {
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
     System.out.println("lütfen terim sayısını giriniz");
    int n = input.nextInt();
    double t =1;
    int f=1;
    int ucler=3;
    int a=1;
    for (int i = 0; i < n-1;i++ ) {
       
             if (a==1) {
                 for (int j = 0; j < i; j++) {
                 ucler*=ucler;
                 a=2;
                 }
                  t-=1/ucler*i;
                 }
             

    }
    t*=3.4;
     System.out.println("Brothers formülüne göre değerin sonucu= "+t);
}}
