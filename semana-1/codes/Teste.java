import java.util.Scanner;

public class Teste {
    
    public static void main(String args[]){

        Scanner input = new Scanner (System.in);

        int num;
        System.out.println("Digite um número");
        num = input.nextInt(); //Le o primeiro inteiro digitado e atribui a num
        

        System.out.printf("Numero digitado: %d\n", num);

        for(int i = 0; i <= 10; i++){
            int mult = num * i;
            System.out.printf("%d * %d = %d\n",num,i,mult);
        }
        final String msg = "Bem vindo";
        input.close();
    }
}
