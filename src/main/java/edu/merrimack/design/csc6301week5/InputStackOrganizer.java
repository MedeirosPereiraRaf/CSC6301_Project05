/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.merrimack.design.csc6301week5;

import java.util.*;

/**
 * This class takes in a stack of integers from the user and sorts it using the Collections Framework.
 * 
 * Note: This is original code produced by the author below.
 * 
 * @author Rafael Pereira
 * @since Week 5 of CSC6301
 * @version 1.0
 */
public class InputStackOrganizer {
    static int NUM_INT_IN_STACK = 10;
    
    /**
     * Main method of the class.
     * 
     * @param args - Default parameter. Not used.
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);  
        Stack stk = new Stack();
        
        // Populate the stack from user inputs
        stk = fillStack(in, stk);
        System.out.println(String.format("Stack BEFORE sorting: %s", stk));
        
        // Sort final stack and print
        Collections.sort(stk);
        System.out.println(String.format("Stack AFTER sorting: %s", stk));
    }
   
    /**
     * This method asks the user for a series of integers and adds them to a Stack. 
     * 
     * The size of the stack is dependent on the value of NUM_INT_IN_STACK.
     * 
     * @param in - Scanner object to obtain inputs from the user through the console.
     * @param myStack - Stack object that will be populated with user inputs.
     * @return - Populated Stack as result of user inputs. 
     */
    public static Stack fillStack(Scanner in, Stack myStack){
        int userInt;
        for(int i=0; i < NUM_INT_IN_STACK; i++){
            System.out.println("Type a number: ");
            userInt = in.nextInt();  
            myStack.push(userInt);
        }
        return myStack;
    }
}
