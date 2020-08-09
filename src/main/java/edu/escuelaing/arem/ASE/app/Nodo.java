package edu.escuelaing.arem.ASE.app;

public class Nodo {
	private Nodo next;
	private Float value;
	private int pos;
	public Nodo(Float valor, Nodo cabeza, int lugar) {
		value=valor;
		next=cabeza;
		pos= lugar;
	}
	public void add(Nodo cola) {
		next= cola;
	}
	public boolean setPos(int posicion) {
		return pos==posicion;
	}
	public float getValue() {
		return value;
	}
	public Nodo getNext() {
		return next;
		
	}
}
