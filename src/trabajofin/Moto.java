package trabajofin;

public class Moto extends Automoviles implements Funciones {

    
    @Override
    public void setMarca(String marca){
        marca = super.marca;

    }
    public void setPrecio(int precio){
        precio = this.precio;
    }
    public String getMarca(){
        return marca;
    }
    public int getPrecio(){
        return precio;
    }
    public void verificarEstado(){
        System.out.println("La moto encendio de manera correcta");
    }
}
