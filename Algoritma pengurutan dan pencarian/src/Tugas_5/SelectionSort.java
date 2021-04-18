/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_5;

/**
 *
 * @author M Syafei
 */
public class SelectionSort {
 
public static void SelectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    public static void main(String a[]){  
        int[] arr1 = {21,33,45,14,46,16,20,22,23};  
        System.out.println("Sebelum Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        SelectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("Sesudah Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}
