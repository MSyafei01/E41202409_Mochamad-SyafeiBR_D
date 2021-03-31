/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;
/**
 
 * @author M Syafei
 */
public class Tugas5c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukan panjang nilai : ");
        int panjang = s.nextInt();
        int[] angka = new int[panjang];
        
            for (int i = 0; i < angka.length; i++) {
                System.out.println("masukan angka ke-"+ (i+1) + " : ");
                angka[i] = s.nextInt();
        }
            int max = angka[0];
            int min = angka[0];
            
            for (int i = 0; i < angka.length; i++) {
                if(max < angka[i]) {
                     max = angka [i];
        }
                
            if(min > angka[i]) {
                min = angka[i];
       
    }
    }
             int avg = 0;
        int sum = 0;
        for (int i : angka) {
           sum += i;
        }

        avg = sum / angka.length;

        System.out.println("nilai minimum : " + min);
        System.out.println("nilai maximum : " + max);
        System.out.println("nilai rata - rata : " + avg);
    }
}

