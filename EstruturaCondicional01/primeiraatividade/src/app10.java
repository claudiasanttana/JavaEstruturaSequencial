//Faça um programa na Linguagem Java para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class app10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é " + quadrado);

    }
}
    
