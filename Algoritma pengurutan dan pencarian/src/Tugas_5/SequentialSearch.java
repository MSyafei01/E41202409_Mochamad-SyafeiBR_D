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
public class SequentialSearch {
    public static void main(String[] args) {
        int [] ContohAngkaPertama = {0,9,8,7,6,5,4,3,2,};
        int target = 5; 
                SequentialSearch(ContohAngkaPertama, target);
    }

    public static void SequentialSearch(int[] parameterOne, int parameterTwo){
        int index = -1;
        for 
                (int i = 0; i < parameterOne.length; i++){
            if (parameterOne[i] == parameterTwo){
                index = i;
                break;
            }
        }
   if (index == -1) {
       System.out.println("Your target interger does not exist in the array ");
   }else {
       System.out.println("Your target integer is in index " + index + " of the array ");
   }
  }
}
