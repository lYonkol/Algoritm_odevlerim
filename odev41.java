/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev41{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        for (int i = 0; i <= x; i++) {
            System.out.println(((i*(i+1))/2)+" değeri üçgensel sayıdır");
        }
        
}}
