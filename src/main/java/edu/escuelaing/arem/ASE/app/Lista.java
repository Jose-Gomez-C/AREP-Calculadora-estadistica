package edu.escuelaing.arem.ASE.app;

public class Lista {
	private Nodo cabeza;
	private Nodo cola;
	private int length;
	
	
	public Lista() {
		length=0;
	}
	public void add(Float value) {
		Nodo aux;
		if (length == 0) {
			cabeza= new Nodo(value, null, length);
			cola = cabeza;
			length+=1;
		}else if (length == 1) {
			aux = new Nodo(value, cabeza, length);
			cabeza.add(aux);
			cola=aux;	
			length+=1;
		}else {
			aux = new Nodo(value, cola, length);
			cola.add(aux);
			cola=aux;
			length+=1;
		}
	}
	public Float getValue(int pos)throws ListaException {
		Nodo actual= cabeza;
		Float valor = null;
		for( int x=0; x<=length && valor == null; x+=1) {
			if (actual.setPos(pos)){
				valor= actual.getValue();
			}else {
				actual= actual.getNext();
			}
		}
		if (valor == null)throw new ListaException(ListaException.index);
		
		return valor;
	}
	public int getLength() {
		return length;
	}
}
