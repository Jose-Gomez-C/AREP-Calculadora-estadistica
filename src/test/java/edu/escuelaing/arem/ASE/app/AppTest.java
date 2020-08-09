package edu.escuelaing.arem.ASE.app;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testList() {
		ArrayList<Float>prueba= new ArrayList<Float>();
		prueba.add((float) 10);
		prueba.add((float) 15);
		prueba.add((float) 30);
		prueba.add((float) 100);
		Lista lista= new Lista();
		lista.add((float) 10);
		lista.add((float) 15);
		lista.add((float) 30);
		lista.add((float) 100);
		Float valor=null;
		for (int x=0;x<4;x+=1) {
			try {
				valor = lista.getValue(x);
			} catch (ListaException e) {
				assertTrue(false);
			}
			
			assertEquals(valor, prueba.get(x));
		}
	}
	public void testMeanColumn1() {
		App datos = new App();
		datos.addNumber((float) 160);
		datos.addNumber((float) 591);
		datos.addNumber((float) 114);
		datos.addNumber((float) 229);
		datos.addNumber((float) 230);
		datos.addNumber((float) 270);
		datos.addNumber((float) 128);
		datos.addNumber((float) 1657);
		datos.addNumber((float) 624);
		datos.addNumber((float) 1503);
		try {
			assertEquals(datos.mean(), (float)550.6);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	public void testMeanColumn2() {
		App datos = new App();
		datos.addNumber((float) 15);
		datos.addNumber((float) 69.9);
		datos.addNumber((float) 6.5);
		datos.addNumber((float) 28.4);
		datos.addNumber((float) 65.9);
		datos.addNumber((float) 19.4);
		datos.addNumber((float) 198.7);
		datos.addNumber((float) 38.8);
		datos.addNumber((float) 138.2);
		datos.addNumber((float) 22.4);
		try {
			assertEquals(datos.mean(), (float)60.32);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	public void testStdDevColumn1() {
		App datos = new App();
		datos.addNumber((float) 160);
		datos.addNumber((float) 591);
		datos.addNumber((float) 114);
		datos.addNumber((float) 229);
		datos.addNumber((float) 230);
		datos.addNumber((float) 270);
		datos.addNumber((float) 128);
		datos.addNumber((float) 1657);
		datos.addNumber((float) 624);
		datos.addNumber((float) 1503);
		try {
			System.out.println(datos.stddev());
			assertEquals(datos.stddev(), (float)572.03);
		} catch (ListaException e) {
			assertTrue(false);
		}
	}
	public void testStdDevColumn2() {
		App datos = new App();
		datos.addNumber((float) 15);
		datos.addNumber((float) 69.9);
		datos.addNumber((float) 6.5);
		datos.addNumber((float) 28.4);
		datos.addNumber((float) 65.9);
		datos.addNumber((float) 19.4);
		datos.addNumber((float) 198.7);
		datos.addNumber((float) 38.8);
		datos.addNumber((float) 138.2);
		datos.addNumber((float) 22.4);
		try {
			System.out.println(datos.stddev());
			assertEquals(datos.stddev(), (float)60.32);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	public void testMeanTable3() {
		App datos = new App();
		datos.addNumber((float) 186);
		datos.addNumber((float) 699);
		datos.addNumber((float) 132);
		datos.addNumber((float) 272);
		datos.addNumber((float) 331);
		datos.addNumber((float) 199);
		datos.addNumber((float) 1890);
		datos.addNumber((float) 788);
		datos.addNumber((float) 1601);
		datos.addNumber((float) 291);
		try {
			System.out.println(datos.stddev());
			assertEquals(datos.mean(), (float)638.9);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	public void testStdDevTable3() {
		App datos = new App();
		datos.addNumber((float) 186);
		datos.addNumber((float) 699);
		datos.addNumber((float) 132);
		datos.addNumber((float) 272);
		datos.addNumber((float) 331);
		datos.addNumber((float) 199);
		datos.addNumber((float) 1890);
		datos.addNumber((float) 788);
		datos.addNumber((float) 1601);
		datos.addNumber((float) 291);
		try {
			System.out.println(datos.stddev());
			assertEquals(datos.stddev(), (float)638.9);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
}
