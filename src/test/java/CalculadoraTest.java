/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.daw.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author melol
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    // @Test
    // public void testDivision() {
    //     System.out.println("division");
    //     int a = 0;
    //     int b = 0;
    //     int expResult = 0;
    //     int result = Calculadora.division(a, b);
    //     assertEquals(expResult, result);
    //     // TODO review the generated test code and remove the default call to fail.
    //     //fail("The test case is a prototype.");
    // }

    /**
     * Test of producto method, of class Calculadora.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.producto(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
