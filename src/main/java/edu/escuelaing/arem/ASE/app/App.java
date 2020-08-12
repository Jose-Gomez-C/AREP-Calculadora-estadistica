package edu.escuelaing.arem.ASE.app;

/**
 * Clase encarga de hacer los c�lculos y crear la lista.
 *@author Jose Luis Gomez Camacho
 */
public class App 
{
	
	private Lista datos;
	/**
	 * Constructor de la clase App encargada de crear la lista.
	 */
	public App() {
		datos= new Lista();
	}
	/**
	 * M�todo encargado de agregar un dato a la lista.
	 * @param dato Numero que se quiere almacenar en la lista.
	 */
	public void addNumber(double dato) {
		datos.add(dato);
	}
	/**
	 * M�todo encargado de calcular el promedio de la lista creada.
	 * @return El promedio calculado.
	 * @throws ListaException
	 */
	public double mean() throws ListaException {
		double sumDatos= (float) 0;
		int longitud= datos.getLength();
		for(int x=0; x < longitud; x+=1) {
			sumDatos+=datos.getValue(x);
		}
		double resultado= fijarNumero(sumDatos/longitud,2);
		return resultado;
	}
	/**
	 * M�todo encargado de calcular la desviaci�n est�ndar de los elementos de la lista.
	 * @return La desviaci�n est�ndar. 
	 * @throws ListaException
	 */
	public double stddev() throws ListaException {
		double sumatoria = (float) 0;
		double promedio = mean();
		int longitud= datos.getLength();
		for(int x=0; x < longitud; x+=1) {
			sumatoria+= (float) Math.pow((datos.getValue(x)-promedio),2);
		}
		double resultado= fijarNumero(Math.sqrt(sumatoria/(longitud-1)),2);
		return resultado;
	}
	/**
	 * M�todo encargado de aproximar a dos cifras.
	 * @param d Valor a aproximar.
	 * @param digitos Numero de decimales que desea aproximar.
	 * @return El valor aproximado. 
	 */
	private static double fijarNumero(double d, int digitos) {
		double resultado;
		resultado = d*Math.pow(10, digitos);
		resultado = Math.round(resultado);
		resultado= resultado/Math.pow(10, digitos);
		return (double) resultado;
		
		
	}
}
