package trabajofin;

public class Moto extends Automoviles implements Funciones {
    String marca;
    int precio;
    
    
    @Override
    public void setMarca(String marca){
        marca = this.marca;

    }
    public void setPrecio(int precio){
        precio = this.precio;
    }
    public void getMarca(){

    }
    public void getPrecio(){

    }
    public void verificarEstado(){
        System.out.println("La moto encendio de manera correcta");
    }
}
