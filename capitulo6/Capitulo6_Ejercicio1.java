
package capitulo6;

public class Capitulo6_Ejercicio1 {

    public static void main(String[] args) {
        int fibonacci[] = new int[20];
        int i;
        fibonacci[0]=1;
        fibonacci[1]=1;
        for (i = 2; i < 20; i++) {
            fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
        }
        for(i = 2; i < 20; i++){
            System.out.println(" Fibonacco  " + i + " es " + fibonacci[i]);
        }
    }
    
}
