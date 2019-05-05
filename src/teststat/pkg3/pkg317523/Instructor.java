/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststat.pkg3.pkg317523;

import java.util.Scanner;

/**
 *
 * @author owais
 */
public class Instructor {
   
    
    public void main(){
         System.out.println("HOLIDAY PARADISE");
        System.out.println("Basic Data Management 1.0 Copyright");
        System.out.println("MAIN MENU");
        System.out.println("Please select:");
        System.out.println("Create new instructor 1");
        System.out.println("Update an instructor 2");
        System.out.println("Delete an instructor 3");
        System.out.println("Show instructor list 4 ");
        System.out.println("Back to main menu 0");
        System.out.print("Please enter your choice: _ 0");
          Scanner in = new Scanner(System.in);  // we are creating object of class here 
        String input1 = in.nextLine();
        int choice = Integer.parseInt(input1);
        System.out.println(choice);

        switch (choice) {
            case 1:
              String output =  addInstructor();
              System.out.println(output);
                break;

        }
        
    }
    
    
     public String addInstructor() {
        return "saeed";
    }
}
