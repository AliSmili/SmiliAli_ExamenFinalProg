package models;

import java.util.ArrayList;
import java.util.Comparator;

public class listaVehiculosParking <T> extends ArrayList <T>{
	
	private Comparator<T> miComparador;

	
	public listaVehiculosParking(Comparator<T> comp){
		
		this.miComparador = comp;
	
	}

}
