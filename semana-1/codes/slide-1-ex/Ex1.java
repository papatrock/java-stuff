import java.util.Scanner;

public class Ex1 {
    public static void  main(String args[]) {

        Scanner input = new Scanner (System.in);
        System.out.printf("Digite um numero\n");
        
        int num = input.nextInt();

        if(num % 2 == 0)
            System.out.printf("É par\n");
        else
            System.out.printf("É impar\n");


        input.close();
    }
}
