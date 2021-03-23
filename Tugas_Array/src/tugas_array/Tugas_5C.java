/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_array;

/**
 *
 * @author M Syafei
 */
//Array 2 Dimensi
public class Tugas_5C {
    
    public static void main(String[] args) {
        int [] [] angka = {
            {5, 6, 1, 7},
            {8, 6, 1, 7},
            {5, 4, 7, 1},
            {8, 3, 7, 5},
    };
        
        for (int baris = 0; baris < 4; baris++) {
                
             for (int kolom = 0; kolom < 4; kolom++){ 
                  System.out.print(angka [baris] [kolom] + "" );
             }
             System.out.print("\n");   
      }
   }
}
