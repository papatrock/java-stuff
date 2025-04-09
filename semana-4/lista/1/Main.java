import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        LampadaLed lampadaLed = new LampadaLed(false);
        LampadaFlourescente lampadaFlouresncente = new LampadaFlourescente(true, 10);

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 1 para lampada de led e 2 para lampada flourescente");

        int escolha = input.nextInt();

        if(escolha == 1){
            if(lampadaLed.getEstado()){
                lampadaLed.desligar();
            }
            else{
                lampadaLed.ligar();
            }

            lampadaLed.printEstado();
        }
        else if(escolha == 2){
            if(lampadaFlouresncente.getEstado()){
                lampadaFlouresncente.desligar();
            }
            else{
                lampadaFlouresncente.ligar();
            }

            lampadaFlouresncente.printEstado();
        }
        else{
            System.out.println("Escolha invalida");
        }


        input.close();

    }
}
