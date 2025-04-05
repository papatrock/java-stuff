import java.util.Scanner;

public class Array {

    public static void main(String args[]){
        int matriz[][] = new int [3][3];
        Scanner input = new Scanner(System.in);

        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                matriz[linha][coluna] = input.nextInt();
            }
        }

        int vetor[] = new int [3];
        for(int coluna = 0; coluna < 3; coluna++){
            vetor[coluna] = 0;
            for(int linha = 0; linha < 3; linha++){
                vetor[coluna] += matriz[linha][coluna]; 
            }
        }


        for(int i = 0; i <3; i++)
            System.out.printf("%d ",vetor[i]);
            System.out.printf("\n");
        

        input.close();
    }
    
}
