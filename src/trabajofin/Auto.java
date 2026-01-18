package trabajofin;

public class Auto extends Automoviles implements Funciones {

    @Override
    public void verificarEstado() {
        System.out.println("El auto " + marca + " encendio de manera correcta");
    }
}
