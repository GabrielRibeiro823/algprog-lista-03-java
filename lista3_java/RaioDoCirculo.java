package lista3_java;

import java.util.Scanner;

public class RaioDoCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a operação (1, 2 ou 3): ");
        int op = sc.nextInt();

        System.out.print("Digite o raio: ");
        double r = sc.nextDouble();

        double pi = 3.141592;

        // Validação do raio
        if (r < 0) {
            System.out.println("Raio inválido.");
            return;
        }

        if (op == 1) {
            double perimetro = 2 * pi * r;
            System.out.println("Perímetro: " + perimetro);

        } else if (op == 2) {
            double area = pi * r * r;
            System.out.println("Área: " + area);

        } else if (op == 3) {
            double volume = (4.0 / 3.0) * pi * r * r * r;
            System.out.println("Volume: " + volume);

        } else {
            System.out.println("Código da operação inválido.");
        }

        sc.close();
    }
}