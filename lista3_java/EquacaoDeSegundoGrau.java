package lista3_java;

import java.util.Scanner;

public class EquacaoDeSegundoGrau {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        // Caso A
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
            return;
        }

        // Caso B (equação de primeiro grau)
        if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau");
            double raiz = -c / b;
            System.out.println("Raiz: " + raiz);
            return;
        }

        // Calculando delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Caso C
        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        }
        // Caso D
        else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
            double raiz = -b / (2 * a);
            System.out.println("Raiz: " + raiz);
        }
        // Caso E
        else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");

            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        sc.close();
    }
}

