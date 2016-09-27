
package prueba_entrada;

public class Evaluacion_29_06 {
    public static void main(String[] args) {
        int fotoAnt[][] = new int[10][10];
        int fotoAct[][] = new int[10][10];
        int pixel[]=new int[100];
        for (int i = 0; i < fotoAct.length; i++) {
            for (int j = 0; j < fotoAct[i].length; j++) {
                fotoAct[i][j] = (int)(Math.random()*10+0);
            }
        }
        for (int i = 0; i < fotoAnt.length; i++) {
            for (int j = 0; j < fotoAnt[i].length; j++) {
                fotoAnt[i][j] = (int)(Math.random()*10+0);
            }
        }
        
        compararPixeles(fotoAnt, pixel);        
        compararFoto(fotoAct, pixel);
        almacenCoordenadas();
        recorrerPixeles();
        completarFoto();
        mostrarFoto();
    }
    public static int compararPixeles(int fotoAnt[][], int pixel[]) { 
        int i;
        for (i = 0; i < fotoAnt.length; i++) {
            for (int j = 0; j < fotoAnt[i].length; j++) {
                if(fotoAnt[i][j]<(fotoAnt[i][j+1]+fotoAnt[i+1][j])){
                    fotoAnt[i][j] = pixel[i];
                }
            }
        }  
        return pixel[i];
    }
    public static void compararFoto(int fotoAct[][], int pixel[]) {
        for (int i = 0; i < fotoAct.length; i++) {
            for (int j = 0; j < fotoAct[i].length; j++) {
                for (int k = 0; k < pixel.length; k++) {
                    if(fotoAct[i][j]==pixel[i]){
                    System.out.println("Se encontro coincidencia");
                    }
                }
            }   
        }
    }
    public static void almacenCoordenadas() {
        
    }
    public static void recorrerPixeles() {
        
    }
    public static void completarFoto() {
        
    }
    public static void mostrarFoto() {
        
    }
}
