package trabajofin;

public class Ui {
    





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

    public void mostrarTotalPagar(int total,Automoviles[] productos) {
        int i; 

        for(i=0; i<productos.length; i++) {
            System.out.println(productos[i].Getmarca() + " " + productos[i].Getprecio());

        }
        System.out.println("El total a pagar es: " + total);
    }

}
