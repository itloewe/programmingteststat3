/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststat.pkg3.pkg317523;

import java.util.Scanner;
import teststat.pkg3.pkg317523.Instructor;

/**
 *
 * @author owais
 */
public class Teststat3317523 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HOLIDAY PARADISE");
        System.out.println("Basic Data Management 1.0 Copyright");
        System.out.println("MAIN MENU");
        System.out.println("Please select:");
        System.out.println("Managing instructors 1");
        System.out.println("Managing customers 2");
        System.out.println("Managing courses 3");
        System.out.println("Program exit 0");
        System.out.println("Please enter your choice:");
        Scanner in = new Scanner(System.in);  // we are creating object of class here 
        String input1 = in.nextLine();
        int choice = Integer.parseInt(input1);
        System.out.println(choice);

        switch (choice) {
            case 1:
                Instructor inst = new Instructor();
                inst.main();
                break;

        }
    }

}
