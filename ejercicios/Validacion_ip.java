
package ejercicios;

import java.util.Scanner;

public class Validacion_ip {
    public static boolean validarIp(String Ip) {
        return Ip.matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    }
    public static void main(String[] args) {
        String ip = "" ;
        ingresarIp(ip);
        hacerBinario(ip);
        
    }
    public static String ingresarIp(String ip) {
        Scanner intro = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese ip");
            ip = intro.nextLine();
            if(validarIp(ip)){
                return("IP bien ingresada"); 
            }else{
                return("IP mal ingresada");
            }
        }
        
    }
    public static String hacerBinario(String ip) {
        char numero[] = ip.toCharArray();
        int num[] = new int[numero.length];
        for (int i = 0; i < numero.length; i++) {
            String cadena="";
            int c=1,b;
            num[i]=(int)numero[i];
            while(c>0){
                c=num[i]/2;
                b=num[i]%2;
                cadena=b+cadena;
                num[i]=c;
            }
            System.out.println("El binario es: "+cadena);
        }
        return("");
    }
}
