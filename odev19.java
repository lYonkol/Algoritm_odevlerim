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
public class odev19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 2; i <= 7; i+=2) {
            for (int j = 2; j <=i; j+=2) {
                    System.out.println(i+""+j);
                    if (j==2) {
                        
                    j++;
                    System.out.println(i+""+j);
                }
            }
                if (i==2) {
                    i++;
                }
            
           
        }
        // TODO code application logic here
    }
    
}
