/********************************************
 * Trabajo Realizado en grupo               *
 *                                          *
 * Integrantes:                             *
 *                                          *
 * Gonzalo Chavez                           *
 * Fernando Robles                          *
 * Juan Miguel Lugand                       *
 *                                          *
 *******************************************/


package Main;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.InputMismatchException;

import Model.Pista;
import Model.TorreDeControl;
import Model.Volador;

import utilidades.GestorVolador;
import utilidades.GestorPistas;
import utilidades.GestorTorreDeControl;

/**************************************** 
 *                                      *
 * En esta clase se inicia la ejecucion * 
 * de la aplicacion.                    *
 *                                      *
 ****************************************/

public class main {
	
	static {
		
		//Creamos Torre de Control//
		TorreDeControl torre = new TorreDeControl("AEP");
		
		//Lo Cargamos a una lista//
		GestorTorreDeControl.agregarTorreControl(torre);
		
		
		
		// Cargamos la lista de objetos voladores // 
		
		// creamos a los voladores //
		Volador volador01 = new Volador (1, "Aerolineas argentinas","LV-HYU","Comercial");
		Volador volador02 = new Volador (1, "American Airlines","N02588","Comercial");
		Volador volador03 = new Volador (1, "QatarAirways","A7-JOS","Comercial");
		Volador volador04 = new Volador (4, "Avion Presidencial","T-01","Oficial");
		
		
		// Cargamos a la lista de Voladores//
		GestorVolador.agregarVolador(volador01);
		GestorVolador.agregarVolador(volador02);
		GestorVolador.agregarVolador(volador03);
		GestorVolador.agregarVolador(volador04);
				
	}
	

 /** Funcion MAIN*/

	public static void main(String[] args) {
		
		TorreDeControl torre = GestorTorreDeControl.getTorreDeControl();
		Pista pista = GestorPistas.getPistas();
		Volador volador = GestorVolador.getVolador(1);
		
		
		// fecha y hora Actual//
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println("SISTEMA DE VUELO       " + currentDate);
		GestorTorreDeControl.verTorreDeControl();
		System.out.println("\n");
		
		
		// Se visualiza la lista de voladores //
		System.out.println("Aeronaves en vuelo:");
		GestorVolador.visualizarVoladores();
	    
		
//		System.out.println("\n");
//		System.out.println("Se busco vuelo;");
//		Volador volador = GestorVolador.getVolador(1);
//		System.out.println(volador);
		System.out.println("\n");
		
		torre.registrarAterrizajes(pista);
		torre.mostrarAterrizajes();
		
	}
	
	/** FUNCIONES */
	
	// CREAR ATERRIZAJE //
	
	public static TorreDeControl crearAterrizaje(Volador volador) {
		
		LocalDateTime fechaAterrizaje = LocalDateTime.now();
		Scanner scanner = new Scanner(System.in);
		
		int idVuelo;
		Volador volador_delaire = null;
		boolean isValidFlight;
		
		// Validamos el tipo de aeronave//
		do
		{
			try
			{
				System.out.println("Ingrese Tipo aeronave:");
				idVuelo = Integer.parseInt(scanner.next());
				volador_delaire = GestorVolador.getVolador(idVuelo);
				
				if(volador == null)
				{
					isValidFlight=false;
					System.err.println("no existe un idVuelo con ese numero, ingrese otro.");			
				}
				else
				{
					isValidFlight = true;
				}
							
			}catch(NumberFormatException e)
			{
				System.err.println("El idVuelo es un valor numérico: ");
				isValidFlight=false;
			}
		}while(isValidFlight!=true);
	
//		Pista pista = new Pista(fechaAterrizaje, volador);
//		return pista;
		
		TorreDeControl torredecontrol = new TorreDeControl();
		return torredecontrol;
		
		
	}

	
}