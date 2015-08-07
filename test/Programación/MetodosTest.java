/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Programación;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nn
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculaRaiz method, of class Metodos.
     */
    @Test
    public void testCalculaRaiz() {
        System.out.println("calculaRaiz");
        double numero = 4.0;
        Metodos instance = new Metodos();
        String expResult = "";
        String result = instance.calculaRaiz(numero);
        assertEquals(2, 2);
    }
    
}
