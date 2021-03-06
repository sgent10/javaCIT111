/*
 * Copyright (C) 2017 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package components.comp2_languageStructures.ls1_basicMethods;

import java.util.Scanner;

/**
 *
 * @author delores
 */
public class DoorGameSeed {
    public static void main(String[] args){
         // welcome header to the game
        System.out.println("WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("-------GRAND PRIZE OR GOATS-------");
        System.out.println("");
        System.out.println("**********     **********     **********");
        System.out.println("*  **    *     *  * *   *     * ***    *");
        System.out.println("*   *    *     * *   *  *     *    *   *");
        System.out.println("*   *    *     *     *  *     * *****  *");
        System.out.println("*   *    *     *    *   *     *    *   *");
        System.out.println("*  ***   *     * ****** *     * ***    *");
        System.out.println("**********     **********     **********");
        System.out.println("");
        
        // create a scanner for user input, prompt the user, and store in doorChoice
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ONE DOOR number you'd like to open - 1, 2, or 3: ");
        int doorChoice = scan.nextInt();
        
        if(doorChoice == 1){
            openDoor1();
        }
       // finish coding the if()-controlled blocks
        
        System.out.println("------Thanks for playing!--------");
        
        
    } // close main
    
     /**
     * Simulates the opening of door 1
     */
    public static void openDoor1(){
        System.out.println("EHHHH! Sorry: just a goat");
    } // close method
    
     /**
     * Simulates the opening of door 2
     */
    public static void oepnDoor2(){
        System.out.println("Hurray! You've won a Java 9000 Series Robot to help you "
                + "with your every programming need.");
    } // close method
    
    /**
     * Simulates the opening of door 3
     */
    public static void openDoor3(){
        System.out.println("EHHHH! Sorry: just a goat");
    } // close method
    
} // close class
