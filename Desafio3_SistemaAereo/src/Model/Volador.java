package Model;

/* CLASE VOLADOR:                       
 * Representa los objetos que estan     
 * volando  */

public class Volador {
	
	// ATRIBUTOS //
	private int idVuelo;
	private String nombreVolador;
	private String matricula;
	private String tipoVolador; // 1- Avion Comercial;  2- Avion Privado; 3- Avion de Carga; 4- Avion Oficial; 5- Avion Sanitario //
	
	//CONSTRUCTOR PARAMETRIZADO //
	
	/*
	 * CONTRUCTOR PARAMETRIZADO
	 * @parma nombreVolador
	 * @param matricula
	 * @param tipoVolador;
	 * */
	public Volador(int idVuelo, String nombreVolador, String matricula, String tipoVolador) {
		this.idVuelo = idVuelo;
		this.nombreVolador = nombreVolador;
		this.matricula = matricula;
		this.tipoVolador = tipoVolador;
	}
	
	//METODOS //
	
	public int getIdVuelo() {
		return idVuelo;
	}

	public String getNombreVolador() {
		return nombreVolador;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTipoVolador() {
		return tipoVolador;
	}

	@Override
	public String toString() {
		return "Volador ["
				+ "idVuelo = " + idVuelo + ", "
				+ "nombreVolador = " + nombreVolador + ", "
				+ "matricula = " + matricula + ", "
				+ "tipoVolador = " + tipoVolador
				+ "]";
	}

	
	
	
	
}