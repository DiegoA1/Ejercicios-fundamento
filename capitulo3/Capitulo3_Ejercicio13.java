
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio13 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Precio;
        System.out.println("Ingresar precio del vehiculo");
        Precio = intro.nextInt();
        int GanVend = (Precio * 8)/100;
        int ImpLoc = (Precio * 3)/100;
        int ImpEst = (Precio * 3)/100;
        int PrecTtal = Precio + GanVend + ImpLoc + ImpEst;
        int CostoAd = GanVend + ImpLoc + ImpEst;
        System.out.println("El valor del vehivulo es: "+Precio);
        System.out.println("Los costos adicionales del vehiculo son: "+CostoAd);
        System.out.println("El preoio total del vehiculo es: "+PrecTtal);
    }
}
