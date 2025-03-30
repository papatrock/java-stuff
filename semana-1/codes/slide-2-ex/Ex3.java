/*
 * Fazer  um  programa  em  Java  que  leia  um  nome  no  formato 
comum,  por  exemplo  “José  Silva”,  e  o  imprima  no  formato 
“Silva, J.”.
 */
import java.util.Scanner;
public class Ex3 {
    

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        String entrada = input.nextLine();
        String saida = "";
        saida = saida.concat(entrada.substring(entrada.indexOf(' '),entrada.length()));
        saida = saida + ", ";
        saida =  saida + entrada.charAt(0) + ".";
        
        
        System.out.println(saida);

        input.close();
    }
}
