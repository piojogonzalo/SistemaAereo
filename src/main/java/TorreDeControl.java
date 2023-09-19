//import java.util.ArrayList;

import java.util.Arraylist;

import java.util.List;

public class TorreDeControl {
    private List<Volador> listaVoladores;

    public TorreDeControl() {
        listaVoladores = new ArrayList<>();
    }

    public void agregarVolador(Volador volador) {
        listaVoladores.add(volador);
    }

    public void gestionarAterrizajes() {
        Operario operario = new Operario();

        for (Volador volador : listaVoladores) {
            if (volador instanceof VoladorConPermiso) {
                VoladorConPermiso voladorConPermiso = (VoladorConPermiso) volador;
                boolean permiso = operario.autorizarAterrizaje(voladorConPermiso);

                if (permiso) {
                    System.out.println("Aterrizando en pista 2: " + voladorConPermiso.getClass().getSimpleName());
                } else {
                    System.out.println("No es posible aterrizar: " + voladorConPermiso.getClass().getSimpleName());
                }
            } else {
                System.out.println("Aterrizando en pista 1: " + volador.getClass().getSimpleName());
            }
        }
    }
}