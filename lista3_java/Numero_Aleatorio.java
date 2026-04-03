package lista3_java;

import java.util.Scanner;
import java.util.Random;

public class Numero_Aleatorio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int menor, maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        int numeroGerado = rand.nextInt(maior - menor + 1) + menor;

        System.out.println("Número gerado: " + numeroGerado);

        if (numeroGerado % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é ÍMPAR");
        }

        sc.close();
    }
}

