import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        IngressoVip ingressoVip = new IngressoVip(10,2);
        IngressoNormal ingressoNormal = new IngressoNormal(10);
        IngressoCamarote ingressoCamarote = new IngressoCamarote(10, 2, 5);

        ingressoNormal.imprimirValor();
        ingressoVip.imprimirValor();
        ingressoCamarote.imprimirValor();

        input.close();

    }
}
