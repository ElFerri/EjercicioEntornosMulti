/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicioentornosmulti;

import java.util.Scanner;

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
    static Scanner entrada=new Scanner(System.in);
    

    /**
     *
     */
    public EjercicioEntornosMultiTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    public double dollar2euro(double euros) {
        System.out.println("Introduce una cantidad de euros");

        euros = entrada.nextDouble();

        return euros;
    }
    	public static double cambiarMoneda(String moneda, double euros, double cambio) {

		String dolares = null;

		if (moneda==dolares)

                cambio = euros*0.87;
        

		return cambio;

	}
        	public static void imprimir(double cambio) {

		System.out.println("El resultado de la conversión es "+cambio);

		return;

	}
                public double euro2dollar(double dolares) {
        System.out.println("Introduce una cantidad de euros");

        dolares = entrada.nextDouble();

        return dolares;
    }
    	public static double cambiardolar(String moneda, double dolares, double cambio) {

		String euros = null;

		if (moneda==euros)

                cambio = dolares*0.742;
        

		return cambio;

	}
        	public static void imprimircambio(double cambio) {

		System.out.println("El resultado de la conversión es "+cambio);

		return;

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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class EjercicioEntornosMulti.
     * Multiplicacion por 15000, el timeout te dira si es capaz de hacerlo en 1
     * ms.
     */
    @Test(timeout = 1)
    public void testMultiplicaTimeout() {
        System.out.println("multiplica");
        int a = 15000;
        int b = 15000;
        int result = EjercicioEntornosMulti.multiplica(a, b);
    }

    /**
     * Test of factorial method, of class EjercicioEntornosMulti.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 0;
        int expResult = 0;
        int result = EjercicioEntornosMulti.factorial(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialFlaso() {
        System.out.println("factorial");
        int numero = 0;
        int expResult = 0;
        int result = EjercicioEntornosMulti.factorial(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
