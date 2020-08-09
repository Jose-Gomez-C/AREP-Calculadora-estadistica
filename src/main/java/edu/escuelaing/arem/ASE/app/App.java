package edu.escuelaing.arem.ASE.app;

/**
 *
 *
 */
public class App 
{
	private Lista datos;
	public App() {
		datos= new Lista();
	}
	public void addNumber(Float dato) {
		datos.add(dato);
	}
	public Float mean() throws ListaException {
		Float sumDatos= (float) 0;
		int longitud= datos.getLength();
		for(int x=0; x < longitud; x+=1) {
			sumDatos+=datos.getValue(x);
		}
		return sumDatos/longitud;
	}
	public Float stddev() throws ListaException {
		Float sumatoria = (float) 0;
		Float promedio = mean();
		int longitud= datos.getLength();
		for(int x=0; x < longitud; x+=1) {
			sumatoria+= (float) Math.pow((datos.getValue(x)-promedio),2);
		}
		System.out.println(longitud);
		return (float) Math.sqrt(sumatoria/(longitud-1));
	}
}
