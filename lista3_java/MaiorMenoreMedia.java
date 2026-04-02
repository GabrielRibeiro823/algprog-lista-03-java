package lista3_java;

import java.util.Scanner;

public class MaiorMenoreMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O numero "+num1+" é maior");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O numero "+num2+" é maior");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("O numero "+num3+" é maior");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O numero "+num1+" é menor");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O numero "+num2+" é menor");
        } else if (num3 < num1 && num3 < num2){
            System.out.println("O numero "+num3+" é menor");
        }

        double media = (num1 + num2 + num3) / 3;
        System.out.println("A media dos numeros é "+media);
    }
}
