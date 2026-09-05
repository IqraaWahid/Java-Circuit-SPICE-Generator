/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i2wahid
 */
public class ResistorTest {
    /**
     * Test of getResistance method, of class Resistor.
     */
    @Test
    public void testGetResistance() {
        System.out.println("getResistance");
        Resistor instance = new Resistor(2, 1, 2, 10.4);
        double expResult = 10.4;
        double result = instance.getResistance();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of spice method, of class Resistor.
     */
    @Test
    public void testSpice() {
        System.out.println("spice");
        Resistor instance = new Resistor(1, 1, 2, 4.2);
        String expResult = "R1 1 2 4.2";
        String result = instance.spice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");       
    }
}
