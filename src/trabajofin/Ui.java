package trabajofin;

public class Ui {
    




    //Se creo el metodo imprimirDatosTienda por ser necesario para la presentacion 
    public void imprimirDatosTienda() {
        System.out.println("          ════════════════════════════════════════════════════════════");
        System.out.println("                           TIENDA DE VEHÍCULOS                      ");
        System.out.println("                           AVENIDA CENTRAL 1234                        ");
        System.out.println("                     LAS MEJORES BICICLETAS, MOTOS Y AUTOS      ");
        System.out.println("          ════════════════════════════════════════════════════════════");
        System.out.println("      ");
        System.out.println("AUTOS DISPONIBLES:              MOTOS DISPONIBLES:               BICICLETAS DISPONIBLES: ");

        System.out.println("Tesla                               Kawasaki                                Bmx");
        System.out.println("Toyota                              italika                                 pinarello");
        System.out.println("Hilux                               Yamaha                                  Gta");


    }

    //Se creo el metodo que calcula el total a pagar usando un arreglo de tipo automoviles
    public void mostrarTotalPagar(int total,Automoviles[] productos) {
        int i; 

        for(i=0; i<productos.length; i++) {
            System.out.println(productos[i].getMarca() + " " + productos[i].getPrecio());

        }
        System.out.println("El total a pagar es: " + total);
    }

    public void mostrarEstadoVehiculo(Automoviles[] productos) {
        int i; 
        Funciones func[];
        func = new Funciones[productos.length];

        for (i = 0; i < productos.length; i++) {

         func[i] = (Funciones) productos[i];
         func[i].verificarEstado();
        }

 

    }

    
}
