
package trabajofin;
public class Trabajofin {
    public static void main(String[] args) {
        int cantidad,total,pagar;
        Automoviles[] productos;
        Ui ap ; 
        ap = new Ui();
        Core rs;
        rs = new Core();
        ap.imprimirDatosTienda();
        cantidad= rs.ingresarCantComprar(1,10,"ingrese la cantidad de productos a comprar entre");
        productos=new Automoviles[cantidad];
        productos=rs.ingresarProductos(cantidad);
        total = rs.calcularTotalPagar(productos);
        ap.mostrarTotalPagar(total, productos);
        pagar = rs.ingresarDineroPagar(0,total,"ingresar dinero a pagar");
        ap.mostrarEstadoVehiculo(productos); 
    }
}
