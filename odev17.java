/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class odev17{
    
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen doğru parçasını giriniz");
    int u= input.nextInt();
  double b=u/(2+Math.sqrt(2));
  double a=u-b;
  
    
    System.out.println("gümüş orana göre doğru parçaları"+a+"-"+b);
}}