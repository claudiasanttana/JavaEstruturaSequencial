//Faça um programa na Linguagem Java que receba um número e mostre o resto da divisão por 6.

import java.util.Scanner;

public class app11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int resto = numero % 6;
        System.out.println("O resto da divisão de " + numero + " por 6 é " + resto);

    }
}
