/*
* Implemente uma telefone com os atributos: código do
    país (DDI), código de área (DDD), número e métodos
    para cadastrar e exibir.
     Implemente um programa que leia cinco número de
    telefones e armazene em um vetor. Lembrando que os
    códigos de país válidos são: 33 (Brasil), 1 (Estados
    Unidos) e 61 (Austrália). Na sequência, exiba os
    números de telefone no seguinte formato: +DDI (DDD)
    número.
 
 */
import java.util.Scanner;
public class Pratica {

    public static class Telefone {
        int DDI;
        int DDD;
        String numero;

        public void cadastrar(int DDI, int DDD, String numero){
            // validaçao de DDI
            if((DDI != 55) && (DDI != 1) && (DDI != 61)){
                System.out.println("DDI invalido, cadastro nao feito.");
                return;
            }
            this.DDI = DDI;
            this.DDD = DDD;
            this.numero = numero;
        }

        public void exibirDados(){
            System.out.printf("%d %d %s\n",this.DDI, this.DDD, this.numero);
        }
    
        
    }
    public static void main(String args[]){
        Telefone[] TelefoneVet = new Telefone[3];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            TelefoneVet[i] = new Telefone(); // instancia
            System.out.printf("Digite o DDI do numero %d\n", i);
            int DDI = input.nextInt();
            input.nextLine(); //consome o \n deixado pelo nextInt

            System.out.printf("Digite o DDD do numero %d\n", i);
            int DDD = input.nextInt();
            input.nextLine();

            System.out.printf("Digite o numero %d\n", i);
            String numero = input.nextLine();

            TelefoneVet[i].cadastrar(DDI,DDD,numero);
        }

        System.out.println("Dados:");
        for(int i = 0; i < 3; i++)
            TelefoneVet[i].exibirDados();


        input.close();
    }
}
