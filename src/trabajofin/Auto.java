package trabajofin;

public class Auto extends Automoviles implements Funciones{
    
    
    
    
    
    //Método que comparten todos los autos en común.
    @Override
    public void verificarEstado(){
        System.out.println("El auto encendio de manera correcta");
    }
}
