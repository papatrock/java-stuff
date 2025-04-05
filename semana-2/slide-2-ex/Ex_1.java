import java.util.Scanner;

public class Ex_1{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int array [] = new int [5];
        
        System.out.println("Digite 5 numeros:");
        for(int i = 0; i < 5; i++)
            array[i] = input.nextInt();

        int sum = 0;
        for(int i = 0; i < array.length; ++i){
            sum += array[i];
        }

        System.out.printf("sum: %d\n",sum);

        input.close();
    }
}