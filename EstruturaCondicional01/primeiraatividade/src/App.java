
//Faça um programa na Linguagem Java que receba 2 números e apresente a multiplicação dos dois números.

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Digite o primeiro valor: ");
        a= sc.nextInt();
        System.out.printf("Digite o segundo valor: ");
        b = sc.nextInt();
        c = a * b;
        System.out.printf("O valor da multiplicação é: " + c );

    }
}

