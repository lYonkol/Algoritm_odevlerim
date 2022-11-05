/*
1.adım başla
2.adım kullıcıdan metre cinsinden uzunluk al 
3.adım Kullanıcıya seçimlerin sun ve birisini seçmesini iste
4.adım Metre olarak alınan birimi kullanıcının seçtiği birime çevir
5.adım Çevirilen birimi ekrana yazdır 
6.adım Bitir

*/
import java.util.Scanner:
public class odev_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen metre cinsinden uzunlugunuzu giriniz");
        double a = input.nextDouble();
        System.out.println("Lutfen girdiginiz uzunlugu cevirmek istediginiz birimi seciniz\n"
                + "1-)mm\n"
                + "2-)cm\n"
                + "3-)dm\n"
                + "4-)dam\n"
                + "5-)hm\n"
                + "6-)km");
        int secim = input.nextInt();
        if (secim==1){
          a= a*1000;
          System.out.println("Girdiginiz uznluk mm cinsinden degeri="+a);
            
        }
        else if (secim==2){
          a= a*100;
          System.out.println("Girdiginiz uznluk cm cinsinden degeri="+a);
            
        }
         else if (secim==3){
          a= a*10;
          System.out.println("Girdiginiz uznluk dm cinsinden degeri="+a);
            
        }
          else if (secim==4){
          a= a/10;
          System.out.println("Girdiginiz uznluk dam cinsinden degeri="+a);
            
        }
          else if (secim==5){
          a= a/100;
          System.out.println("Girdiginiz uznluk hm cinsinden degeri="+a);
            
        }
          else if (secim==6){
          a= a/1000;
          System.out.println("Girdiginiz uznluk km cinsinden degeri="+a);
            
        }
          else{
              System.out.println("Hatalı secim yaptınız!!!");
          }
                
                    
}
