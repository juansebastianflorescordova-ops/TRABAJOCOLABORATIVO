package trabajofin;

public class Bicicleta extends Automoviles implements Funciones {
    
    
    
    
    //Metodo Heredado
    @Override
    public void verificarEstado(){
        System.out.println("La bicicleta "+ marca +" se encuentra en buen estado");
    }
}
