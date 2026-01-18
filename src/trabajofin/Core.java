package trabajofin;

import java.util.Scanner;

public class Core {
    public int ingresarCantComprar(int min, int max, String mensaje){
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
        Scanner x = new Scanner(System.in);
        
        int n;
        n = 0;
        
        do{
            System.out.println(mensaje + " (" + min + " y " + max + ")");
            n = x.nextInt();
        } while(n<min && n>max);
        return n;
    }

    public Automoviles[] ingresarProductos(int cantidad){
        int tipo;
        Automoviles productos[];
        Core rs;
        rs = new Core();
        productos = new Automoviles[cantidad];
        for(int i=0;i<cantidad;i++){
            
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
    public int ingresarDineroPagar(int total, String mensaje){
        int n;
        Scanner y;
        y = new Scanner(System.in);
        System.out.print(mensaje);
        n = y.nextInt();
        do{
           if(n<total){
               System.out.print("El dinero ingresado es insuficiente, ingrese nuevamente: ");
               n = y.nextInt();
           }

        } while(n<total);
        return n;
    }

    public void calcularDiferencia(int total, int pagar){
        int diferencia;
        diferencia = pagar - total;
        if(diferencia>0){
            System.out.println("Su cambio es: " + diferencia);
        } else {
            System.out.println("Gracias por su compra");
        }
    }
}
