
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio8 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int SlAnt=0;
        System.out.println("Ingresar antiguo salaio");
        SlAnt = intro.nextInt();
        double Aumento = SlAnt * 0.1;
        double SalNvo = SlAnt + Aumento;
        System.out.println("El nuevo salario es: "+SalNvo);
    }
}
