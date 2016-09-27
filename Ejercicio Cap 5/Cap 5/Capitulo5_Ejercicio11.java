
package capitulo5;

import java.util.Scanner;

public class Capitulo5_Ejercicio11 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int i, x, a=0, r=0;
        double Promedio, Nota, z=0, max=0, min=100;
        System.out.println("Ingresar cantidad de notas del alumno");
        x = intro.nextInt();
        System.out.println("Ingresar notas del alumno");
        for (i = 0; i < x; i++){
            Nota = intro.nextDouble();
            z = z + Nota;
            
            if(Nota >= 4){
                a++;
            }else{
                r++;
            }
            
            if(Nota > max)
                max = Nota;
            if(Nota < min)
                min = Nota;
        }
        Promedio = Math.round(z/x); 
        System.out.println("El promedio de nota es de: "+Promedio);
        System.out.println("La cantidad de notas aprobadas es de: "+ (int)a);
        System.out.println("La cantidad de notas reprobadas es de: "+ (int)r);
        System.out.println("La nota más alta es de: "+max);
        System.out.println("La nota más baja es de: "+min);
        if ((Promedio >= 4.0) &&(r * 100 / x)<50){
            System.out.println("El alumno aprobo");
        }else{
            System.out.println("El alumno reprobo");
        }
    }
}
