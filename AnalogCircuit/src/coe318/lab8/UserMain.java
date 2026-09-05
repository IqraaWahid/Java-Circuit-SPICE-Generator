/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab8;

import java.util.Scanner;

/**
 *
 * @author i2wahid
 */

public class UserMain {

    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in); //this will allow input from the user
        Circuit circuit = new Circuit(); //creating an object of Circuit class

        while (true) {
            if (!input.hasNext()) break; //if user doesn't enter a String data type, terminate program
            String userInput = input.next(); //store user input in variables: 'userInput'

            if (userInput.equalsIgnoreCase("end")) {//when the user eneters "end":
                System.out.println("All Done"); //output "All Done"
                break; // and terminate program
            }

            else if (userInput.equalsIgnoreCase("spice")) { //is user enters "spice"
                System.out.println(circuit.spice()); //call spice method in interface
            }

            else if (userInput.equalsIgnoreCase("r")) { //user wants to make a resistor
                //store the other inputs:
                int node1 = input.nextInt();
                int node2 = input.nextInt();
                double resistance = input.nextDouble();
                circuit.addResistor(node1, node2, resistance); //add the resistor user wants
            }

            else if (userInput.equalsIgnoreCase("v")) { //user wants to make a resistor
                //store the other inputs of the voltage description
                int node1 = input.nextInt();
                int node2 = input.nextInt();
                double voltage = input.nextDouble();
                circuit.addVoltage(node1, node2, voltage);
            }
        }
    }
}
