
package capitulo_7;

import java.util.Scanner;

public class Res_7_4 {
    public static int vecesLetra(String palabra, char letra) {
        int cont=0;
        for (int i = 0; i < palabra.length(); i++) {
            if(letra == palabra.charAt(i))
                cont++;
        }
        return cont;        
    }
}
