public class Main 

{
    public static void main(String[] args) {
        TorreDeControl torre = new TorreDeControl();

        // Agregar objetos voladores a la lista
        torre.agregarVolador(new Avion());
        torre.agregarVolador(new Helicoptero());
        torre.agregarVolador(new Pajaro());

        // Gestionar aterrizajes
        torre.gestionarAterrizajes();
    }
}