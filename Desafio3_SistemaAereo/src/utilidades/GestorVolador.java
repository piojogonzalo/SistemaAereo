package utilidades;

import java.util.ArrayList;
import java.util.List;
import Model.Volador;

/*********************************************
 * Esta clase simula una tabla de 
 * Objetos Voladores.
 * 
 **********************************************/

public class GestorVolador {
	
	// declara lista de voladores //
	
	private static List<Volador> voladores;
	
	static {

		voladores = new ArrayList<>();
	}
	
	/*************************************************
	 * Agrega un volador a los registros de voladores
	 * @param volador.
	 * 
	 ********************************************/
	public static void agregarVolador(Volador volador) {
		voladores.add(volador);
			
	}
	
	/****************************************************************
	 * Busca un volador por tipo de volador
	 * @param tipoVolador.
	 * @return un volador.
	 **************************************************************/
	
	public static Volador getVolador(int idVuelo) {
		Volador volador = null;
		for(Volador v: voladores)
		{
			if(v.getIdVuelo() == idVuelo)
			{
				volador = v;
			}
		}
		return volador;
	}
	
	// Ver voladores por pantalla //
	
	public static void visualizarVoladores() {
		for(Volador v: voladores)
		{
			System.out.println(v);
		}
	}
}