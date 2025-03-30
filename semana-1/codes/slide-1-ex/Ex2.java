/*
 * Faça  um  programa  em  Java  que  leia  números  inteiros enquanto  não  *  for  digitado  o  número  -1,  e  calcule  e imprima a soma destes números
 */

import java.util.Scanner;

public class Ex2 {

    public static void main(String args[]){
        int sum, num;
        num = sum = 0;
        Scanner input = new Scanner(System.in);

        do{
            sum += num;
            num = input.nextInt();
        }while(num != -1);

        System.out.printf("soma: %d\n", sum);

        input.close();
    }
}
