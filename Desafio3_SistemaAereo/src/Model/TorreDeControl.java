package Model;

import java.util.ArrayList;
import java.util.List;

/**************************************** 
 *                                      *
 * CLASE TORRE DE CONTROL:              * 
 * Representa la torre de contrl del    *
 * del aeropuerto. Gestiona y decide    *
 * quien aterriza.                      *
 ****************************************/

public class TorreDeControl {
	
	// ATRIBUTOS //

//	private int nroTorre;
	
	private String nombreAeropuerto;
	
	//Lista de cotizaciones realizadas por Torre De Control//
	private List<Pista> aterrizajePistas;
	
	//Lista de Voladores//
	private List<Volador> listaVoladores;
	
	
	//  CONSTRUCTORES //
	
	//Se declara La lista de pista//
	public TorreDeControl() {
		aterrizajePistas = new ArrayList<>();
	}
	
	/*******************************
	 * CONSTRUCTOR PARAMETRIZADO
	 *
	 * @param pistas
	 * @param listaVoladores
	 * 
	 *****************************/
	public TorreDeControl( String nombreAeropuerto) {
//		this.nroTorre = nroTorre;
		this.nombreAeropuerto = nombreAeropuerto;
		this.aterrizajePistas = new ArrayList<>();
	}
	
	// METODOS //
	
	// registra aterrizajes en pistas //
	
	public void registrarAterrizajes(Pista pista) {
		this.aterrizajePistas.add(pista);
	}
	
	// Se visualiza por pantalla el registro de aterrizajes en pistas //
	
	public void mostrarAterrizajes() {
		for(Pista p: aterrizajePistas)
		{
			System.out.println(p);
		}
	}

	
	
	// GETTER Y SETTER //
	
	

	public List<Pista> getAterrizajePistas() {
		return aterrizajePistas;
	}
	
	

//	public int getNroTorre() {
//		return nroTorre;
//	}

	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}

	public List<Volador> getListaVoladores() {
		return listaVoladores;
	}

	@Override
	public String toString() {
		return "TorreDeControl ["
				+ "nombreAeropuerto = " + nombreAeropuerto 
				+ ", aterrizajePistas = " + aterrizajePistas
				+ ", listaVoladores = " + listaVoladores + 
				"]";
	}
	
}