/*
Escreva um programa em Java que exiba uma String 
na ordem inversa.
 */

import java.util.Scanner;

public class Inverso {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String frase = input.nextLine();
        String fraseInvertida = "";
        int tam = frase.length();
    
        for (int i = tam - 1; i >= 0; i--){
            fraseInvertida = fraseInvertida.concat(frase.charAt(i)+"");
        }

        System.err.println(fraseInvertida);
        input.close();

    }
   


}
