package trabajofin;

import java.util.Scanner;

public class Core {
    public int ingresarCantComprar(byte min, byte max, String mensaje){
        int n;
        Scanner sc;
        sc = new Scanner(System.in);
        do{
            System.out.print(mensaje + "(" + min + " y " + max + "): ");
            n = sc.nextInt();
        } while(n<min || n>max);
        return n;
    }

    public int ingValor(byte min, byte max, String mensaje){
        Scanner sc;
        sc = new Scanner(System.in);
        int n;
        n = 0;
        
        do{
            System.out.println(mensaje + " (" + min + " y " + max + ")");
            n = sc.nextInt();
        } while(n<min && n>max);
        return n;
    }

    public Automoviles[] ingresarProductos(int cantidad){
        Automoviles productos[];
        Core rs;
        rs = new Core();
        productos = new Automoviles[cantidad];
        for(int i=0;i<cantidad;i++){
            int tipo;
            tipo = rs.ingValor((byte)1,(byte)3,"ingrese el tipo de vehiculo a comprar: 1.Auto 2.Moto 3.Bicicleta");
            switch(tipo){
                case 1:
                    productos[i] = new Auto();
                    productos[i].ingresarDatosAutomovil();
                    break;
                case 2:
                    productos[i] = new Moto();
                    productos[i].ingresarDatosAutomovil();
                    break;
                case 3:
                    productos[i] = new Bicicleta();
                    productos[i].ingresarDatosAutomovil();
                    break;
            }
        }
        return productos;
    }
    public int calcularTotalPagar(Automoviles[] prod){
        int contador,i;
        contador = 0;
        for(i = 0; i<prod.length; i++){
            contador = prod[i].precio + contador;
        }
        return contador;
    }
}
