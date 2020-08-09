package edu.escuelaing.arem.ASE.app;

public class ListaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String index= "index out of range";
	
	public ListaException( String message) {
		super(message);
	} 
}
