/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab8;

/**
 *
 * @author i2wahid
 */
public class Voltage implements CircuitSpice {
    //declaring instance variables:
    private int node1, node2, num;
    private double voltage;
    
    /**
     * Constructor: setting initial values of the instance variables
     * @param first second node number the resistor is between, and the resistance of the resistor
     */
    public Voltage(int num, int node1, int node2, double voltage){
        this.num=num;
        this.node1=node1;
        this.node2=node2;
        this.voltage=voltage;
    }
    
    public int getNode1(){
       return node1;
    }
    
    public int getNode2(){
       return node2;
    }
    
    public double getVoltage(){
       return voltage;
    }
    
    /**
     * @param none
     *
     * @return string description of components user entered
     */
    @Override
    public String spice(){
        return ("V" + num + " " + node1 + " " + node2 + " DC " + voltage);
    }
}