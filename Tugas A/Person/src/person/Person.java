/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import static java.time.Clock.system;
import java.util.Scanner;

//**
// * @author M Syafei
public class Person {

    public static void main(String[] args) {
        // Buat Scanner
        Scanner input = new Scanner (System.in);
        // Ambil nilai dari keyboard
            System.out.println("First Name = ");
            String fname1 = input.next();
            
            System.out.println("Last Name = ");
            String lname = input.next();
            
            System.out.println("Student ID = ");
            String stuid = input.next();
            
            System.out.println("Student Status = ");
            String stutstatus = input.next();
            
    }
    
}
