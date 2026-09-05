/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab8;

import java.util.ArrayList;

/**
 *
 * @author i2wahid
 */

public class Circuit {
    private ArrayList<CircuitSpice> circuitComponents;
    private int rCount = 0; //count for resistor
    private int vCount = 0; //count for voltage

    public Circuit() {
        circuitComponents = new ArrayList<>();
    }

    public void addResistor(int node1, int node2, double resistance) {
        rCount++;
        circuitComponents.add(new Resistor(rCount, node1, node2, resistance));
    }

    public void addVoltage(int node1, int node2, double voltage) {
        vCount++;
        circuitComponents.add(new Voltage(vCount, node1, node2, voltage));
    }
    
    public String spice() {
        String result = "";

        for (CircuitSpice c : circuitComponents) { // enhanced for loop
            result += c.spice() + "\n"; // add the components spice String to String result
        }

        return result.trim();
    }

}

