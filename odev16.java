/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev16{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen kısa kenarını giriniz");
    int a= input.nextInt();
  double b=a*(1+Math.sqrt(5))/2;
    
    System.out.println("altın üçgenin tüm kenarları"+a+b+b);
}}