
package ejercicios;

import java.util.Scanner;

public class validacion_correo {
    public static boolean validarMail(String mail) {
        return mail.matches("[a-z]{1,1}\\.{1,1}[a-z]+[0-9]{2,2}@ufromail{1,1}\\.{1,1}cl{1,1}");
    }
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        while(true){
            System.out.println("ingrese su ufro mail para validar");
            String correo = intro.nextLine();
            if(validarMail(correo)){
                System.out.println("Felicidades su correo es ufromail");
                break;
            }else{
                System.out.println("Su correo no es ufromail");
                break;
            }  
        }
    }
}
