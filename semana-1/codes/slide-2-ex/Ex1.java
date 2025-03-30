/*
 * Crie  um  programa  Java  que  leia  uma  sentença  e  substitua 
todas as letras a por @
 */
import java.util.Scanner;

public class Ex1 {

    public  static void main (String args[]){
        Scanner input = new Scanner(System.in);

        String frase = input.nextLine();

        String subs = frase.replace('a', '@');
        System.out.println(subs);
        subs = frase.replace(" ", "");
        System.out.println(subs);

        input.close();

    }
    
}
