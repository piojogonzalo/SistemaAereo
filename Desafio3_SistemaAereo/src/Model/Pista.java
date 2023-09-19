package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**************************************** 
 *                                      *
 * CLASE PISTA:                         * 
 * Representa la PISTA donde aterrizan  *
 * los voladores.                       *
 *                                      *
 ****************************************/

public class Pista {
	
	// ATRIBUTOS //
	
	//private String nombrePista;
	
	private LocalDateTime fechaManiobra;
	
	private Volador volador;

	
	
	// CONSTRUCTORES //
	
	/*******************************************
	 * CONSTRUCTOR PARAMETRIZADO
	 * 
	 * @param fechaManiobra
	 * @param volador
	 ********************************************/
	
	public Pista( LocalDateTime fechaManiobra, Volador volador) {
		//this.nombrePista = nombrePista;
		this.fechaManiobra = fechaManiobra;
		this.volador = volador;
	}



	@Override
	public String toString() {
		return "Pista [ fechaManiobra=" + fechaManiobra + ", volador=" + volador + "]";
	}







	public LocalDateTime getFechaManiobra() {
		return fechaManiobra;
	}



	public Volador getVolador() {
		return volador;
	}
	
	
	

}
