package utilidades;

import java.util.ArrayList;
import java.util.List;

import Model.TorreDeControl;

public class GestorTorreDeControl {

	private static List<TorreDeControl> torresControles;
	
	static {
		
		torresControles = new ArrayList<>();
	}
	
	
	public static void agregarTorreControl(TorreDeControl torredecontrol) {
		
		torresControles.add(torredecontrol);
	}
	
	
	public static  TorreDeControl getTorreDeControl() {
		TorreDeControl torredecontrol = null;
		for(TorreDeControl t: torresControles)
		{
			torredecontrol = t;
		}
		return torredecontrol;
	}
	
	public static void verTorreDeControl() {
		for(TorreDeControl t: torresControles) 
		{
			System.out.println(t);
		}
	
	}
	
	
}