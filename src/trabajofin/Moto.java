package trabajofin;

public class Moto extends Automoviles implements Funciones {
    
    @Override
    public void verificarEstado(){
        System.out.println("La moto " + marca + " encendio de manera correcta");
    }
}
