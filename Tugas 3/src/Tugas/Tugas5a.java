/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author M Syafei
 */
public class Tugas5a {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int panjang = 0;
                System.out.print("masukan panjang nilai : ");
            panjang = s.nextInt();
        int[] angka = new int[panjang];

        for (int i = 0; i < panjang; i++) {
                System.out.print("masukan nilai ke-" + i + " : ");
            angka[i] = s.nextInt();
        }

                System.out.print("[ ");
        for (int i : angka) {
                System.out.print(i + " ");
        }
              System.out.println("]");

        Arrays.sort(angka);
                System.out.println("Nilai setelah diurutkan dari yang terkecil - terbesar");
                System.out.println("=====================================================");
            System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
