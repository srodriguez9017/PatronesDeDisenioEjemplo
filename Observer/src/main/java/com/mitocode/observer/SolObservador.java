package com.mitocode.observer;

public class SolObservador extends Observador{

	private double valorCambio = 3.25;
	
	public SolObservador(Subject sujeto) {
		//ESTOS THIS HACEN REFERENCIA  A LA PROPPIEDAD DE LA CLASE  ABSTRACTA
		this.sujeto = sujeto;
		//SE AGREGAEL SUJETO AL ARRAY DE OBSERVADORES
		this.sujeto.agregar(this);
	}
	
	//SIMPLEMENTESE SOBRE ESCRIBE EL METODO ACTUALIZAR DE LA CLASE ABSTRACTA
	@Override
	public void actualizar() {		
		System.out.println("PEN: " + (sujeto.getEstado() * valorCambio));
	}

}
