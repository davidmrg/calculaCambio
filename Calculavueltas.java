/*
El programa debe calcular el cambio exacto. Recibe los siguientes datos: 
- Costo de artículo vendido
- Dinero entregado por el cliente (pago)

El programa debe incluir lógica para:
- Imprimir la cantidad del cambio (vueltas) si el pago es mayor al precio del producto
- Mostrar mensaje si el pago es igual al precio del producto
- Mostrar mensaje si el pago es menor al precio del producto

 */
package calculavueltas;

import java.util.Scanner;


/**
 *
 * @author David Ramirez
 */
public class Calculavueltas {

   
    public static void main(String[] args) {
    
        float costo;
        float pago;
        float cambio;
    
        //Implementamos clase Scanner, la inicializamos con el objeto sc.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el costo del articulo: ");
        costo = sc.nextFloat();
        
        System.out.println("Ingrese el pago efectuado: ");
        pago = sc.nextFloat();
        
        if (pago > costo){
            cambio = pago - costo;
            System.out.println("El cambio para el cliente es: " + cambio);
        }else{
            cambio = pago - costo;
            cambio = Math.abs(cambio);
            System.out.println("El pago faltante es: " + cambio);
        }
            
        if (pago == costo){
            System.out.println("No hay cambio, el pago es completo");
        }
        
        
    }
    
}
