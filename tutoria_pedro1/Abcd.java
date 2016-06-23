
package tutoria_pedro1;

public class Abcd {
    public static void main(String[] args) {
        char letra='a';
        char abecedario[]=new char[26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i]= letra++;
            System.out.print(""+abecedario[i]+", ");
        }
        
    }
}
