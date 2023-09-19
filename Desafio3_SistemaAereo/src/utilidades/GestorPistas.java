package utilidades;

import java.util.ArrayList;
import java.util.List; 
import Model.Pista;

/*********************************************
 * Esta clase simula una tabla de 
 * Pistas.
 * 
 **********************************************/

public class GestorPistas  {
	
	// declara lista de pistas //
	
	private static List<Pista> pistas;
	
	static {
		
		pistas = new ArrayList<>();
	}
	
	// Agrega una pista a la lista de pistas//
	
	public static void agregarPista(Pista pista) {
		pistas.add(pista);
	}
	
	public static Pista getPistas() {
		Pista pista = null;
		for(Pista p: pistas)
		{
			pista = p;
		}
		return pista;
	}
	
	// Ver Pistas Por Pantalla //
	
	public static void verPistas() {
		for(Pista p: pistas)
		{
			System.out.println(p);
		}
	}
}