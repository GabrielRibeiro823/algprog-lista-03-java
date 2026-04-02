package lista3_java;


import java.util.Scanner;

public class MaquinaDeVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = 50;
        int valor2 = 20;
        int valor3 = 10;
        int valor4 = 5;
        int valor5 = 2;
        int valor6 = 1;

        System.out.println("Quanto o cliente ira paga: ");
        int valorCompra = sc.nextInt();

        System.out.println("Quanto ele recebera de troco: ");
        int valorPago = sc.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Valor invalido.");
            return;
        }

        int troco = valorPago - valorCompra;


        int quantidade50 = troco / valor1;
        troco %= valor1;
        int quantidade20 = troco / valor2;
        troco %= valor2;
        int quantidade10 = troco / valor3;
        troco %= valor3;
        int quantidade5 = troco / valor4;
        troco %= valor4;
        int quantidade2 = troco / valor5;
        troco %= valor5;
        int quantidade1 = troco / valor6;
        troco %= valor6;


        System.out.println("Troco: R$ " + (valorPago - valorCompra));
        System.out.println("Notas de R$ 50: " + quantidade50);
        System.out.println("Notas de R$ 20: " + quantidade20);
        System.out.println("Notas de R$ 10: " + quantidade10);
        System.out.println("Notas de R$ 5: " + quantidade5);
        System.out.println("Notas de R$ 2: " + quantidade2);
        System.out.println("Notas de R$ 1: " + quantidade1);


    }
}
