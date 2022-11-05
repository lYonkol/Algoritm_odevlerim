/*
1.adım başla
2.adım Kullanıcadan üçgene ait 3 kenarı al 
3.adım Eğer girilen kenarlar eşitse çeşitkenar üçgen yazdır ,
4.adım Eğer girilen kenarlardan 2tanesi eşitse ikizkenar üçgen yazdır
5.adım Değilse çesitkenar üçgen yazdır;
6.adım bitir
*/












import java.util.Scanner;
 
public class odev_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Lutfen bir ucgen giriniz");
       System.out.println("Birinci kenarı giriniz");
       int a =input.nextInt();
       System.out.println("İkinci kenarı giriniz");
       int b = input.nextInt();
       System.out.println("Ucuncu kenari girinizi");
       int c = input.nextInt();
        if (a==b || a==c || b==c){
           System.out.println("Girdiginiz ucgen ikizkenar ucgendir");
           }
        else if (a==b && a==c){
            System.out.println("Girdiginiz ucgen eskenar ucgen");
        }
        else if (a!=b && b!=c){
            System.out.println("Girdginiz ucgen cesitkenardır");
        }
        
   
    }
    
    
    
}
