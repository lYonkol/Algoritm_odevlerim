/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev48{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen kısa kenarını giriniz");
    int f2= input.nextInt();
    double ao= (1+Math.sqrt(5))/2;
     int f1=(int)(f2/ao);
     int f3=(int)(f2*ao);
    
    System.out.println(f1+"-"+f2+"-"+f3);
}}