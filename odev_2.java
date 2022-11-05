/*
1.adım Başla
2.adım Kulannıcadan 1ve 7 arasında bir sayı al 
3.adım Kullanıcadan alınan sayınıyı haftanın ilgili gününyle ilişkilendir
4.adım ilişkilendirilen günü ekrana yazdır
5.adım Bitr
*/










import java.util.Scanner;
public class odev_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Lutfen bir sayi giriniz(1-7arasında)");
     int a = input.nextInt();
     if (a==1){
         System.out.println("Gunlerden Pazartesi");
     }
     else if (a==2){
         System.out.println("Gunlerden Salı");
     }
          else if (a==3){
         System.out.println("Gunlerden Carsamba");
        
     }
          else if (a==4){
         System.out.println("Gunlerden Persembe");
     }
          else if (a==5){
         System.out.println("Gunlerden Cuma");
     }
         else if (a==6){
         System.out.println("Gunlerden Cumartesi");
     }
        else if (a==7){
         System.out.println("Gunlerden  Pazar");
     }
        else{
            System.out.println("Girdiginiz sayı 1-7 arasında degildir");
        }    
         
    
}
