package trabajofin;
import java.util.Scanner;
public class Automoviles {
    String marca;
    int precio;

        // Setters y Getters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }

    //método para ingresar datos del vehículo
    public void ingresarDatosAutomovil(){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Ingrese la marca del vehículo: ");
        marca = sc.nextLine();
        System.out.print("Ingrese el precio del vehículo(Vendedor): ");
        precio = sc.nextInt();  
    }

}