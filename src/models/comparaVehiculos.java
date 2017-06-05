package models;

import java.util.Comparator;
import java.util.Date;

public class comparaVehiculos<T> implements Comparator<T>{
	private Vehiculo v1, v2;

	public comparaVehiculos(){
		
	}
	/**
	 * ORDENACION DE MAYOR A MENOR SEGUN FECHA DE ENTRADA
	 */
	  public int compare(Object v1, Object v2){
	      Date fecha1 = ((Vehiculo) v1).getHoraEntrada( );
	      Date fecha2 = ((Vehiculo) v2).getHoraEntrada() ;
	      if(fecha1.after(fecha2)){
	          return -1;
	       }else if(fecha1.before(fecha2)){
	          return 1;
	       }else{
	          return 0;
	       }
	    }
	  
	

}
