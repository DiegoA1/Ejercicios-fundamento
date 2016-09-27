package clasejava1;

import java.util.Scanner;


public class IngresoAlgo {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in); // instanciamos la clase scanner
        String usuario = "";
        System.out.println("Ingrese su nombre");
        usuario = intro.nextLine(); // Captura una cadena de caracteres que ingrese el usuario
        System.out.println("Hola "+usuario);
        intro.close();
    }
}
/*
En este ejemplo estamos utilizando la clase scanner,
y para hacerlo debemos crear una variable del mismo tipo
de dicha clase, en la forma que se hace en la linea 7.
A esto se le llama "instanciar una clase".
*/