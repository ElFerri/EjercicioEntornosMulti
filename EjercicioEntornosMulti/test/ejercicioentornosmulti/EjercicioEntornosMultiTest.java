/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicioentornosmulti;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author fersan
 */
public class EjercicioEntornosMultiTest {
    
    public EjercicioEntornosMultiTest() {
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
     * Test of multiplica method, of class EjercicioEntornosMulti.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = EjercicioEntornosMulti.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EjercicioEntornosMulti.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjercicioEntornosMulti.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
        /**
     * Test of multiplica method, of class EjercicioEntornosMulti.
     */
    @Test(timeout=1)
    public void testMultiplicaTimeout() {
        System.out.println("multiplica");
        int a = 15000;
        int b = 15000;
        int expResult = 0;
        int result = EjercicioEntornosMulti.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
