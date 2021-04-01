/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**z
 *
 * @author M Syafei
 */
public class Tugas5b_2 {
    public static void main(String[] args) {
 
           System.out.println(" ");
                System.out.println("Bilangan perkalian 2 (0-100)");
               System.out.println("=================================");
            int j = 0;
        do {  
            if(j==0) {
              j = 1;  
            } else { System.out.print(j * 2 + " ");
                
                
            }
            j++;
        }while(j <= 100);
    }
}