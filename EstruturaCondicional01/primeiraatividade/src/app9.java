
/*Faça um programa na Linguagem Java  para ler dois valores inteiros para as variáveis A e B e efetuar a troca
dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o 
valor da variável A. Apresentar os valores trocados.*/

import java.util.Scanner;

public class app9 {
    public static void main (String args[]){
        int A,B,C;
        Scanner sc= new Scanner (System.in);
        System.out.printf("Digite um número inteiro para A: ");
        A= sc.nextInt();
        System.out.printf("Digite um número inteiro para B: ");
        B= sc.nextInt();
        C= A;
        A= B;
        B= C; 
        System.out.printf("O valor de A é: "+ A + " e o valor de B é: " + B);
    }
}
    

