
package clasejava1;


public class Ciclos {
    public static void main(String[] args) {
        int cont=0;
        // Simalar al repetir, cambia la condicion de termino
        do{
            cont++;
            System.out.print(cont +"  ");
        }while(cont<9);
        
        System.out.println("");
        cont=0;
        // mientras se cumpla la condicion itera
        while(cont<9){
            cont++;
            System.out.print(cont +"  ");
            
        }
        // para un i=1 iterar hasta que la condicion sea falsa
        System.out.println();
        for (int i = 1; i <=9; i++){
            System.out.print(i +"  ");
        }
    }
}
