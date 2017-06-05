package controllers;

import java.util.Date;

import models.Vehiculo;
import models.comparaVehiculos;
import models.listaVehiculosParking;
 class controlVehiculos {
	
	private static comparaVehiculos<Vehiculo> comp;
	private static listaVehiculosParking<Vehiculo> listaVehiculos = new listaVehiculosParking<Vehiculo>(comp );
		
		
		public static boolean Buscar(Date horaEntrada){
			Vehiculo via = Obtener(horaEntrada);
			
			if(via == null){
				return false;
			}else{
				return true;
			}
		}
		
		
		public static Vehiculo Obtener(Date horaEntrada){
			Vehiculo veh = null;
			
			for(Vehiculo i: listaVehiculos){
				if(i.getHoraEntrada().equals(horaEntrada)){
					veh = i;
				}
			}
			
			return veh;
		}
		
		/**
		 Aniadimos el vehiculo si la hora de entrada no coincide en nuestra lista
		 */
		public static void Aniadir(int matricula,Date horaEntrada, Date horaSalida, String pago){
			if(Buscar(horaEntrada)) throw new RuntimeException("No se puede añadir el cliente porque ya hay uno con la misma hora de entrada");
			
			listaVehiculos.add(new Vehiculo(matricula,horaEntrada,horaSalida, pago));
		}

}
