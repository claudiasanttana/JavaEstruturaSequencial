/*Faça um programa na Linguagem Java que efetue a apresentação do valor da conversão em real de um valor lido 
em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com
o usuário, para que seja apresentado o valor em moeda brasileira.*/

import java.util.Scanner;

public class app8 {
    public static void main( String args[]){

    double conversao, qtdeDolar, valorDolar;
    Scanner sc= new Scanner(System.in);
    System.out.printf("Digite quanto está o dólar hoje: ");
    valorDolar= sc.nextDouble();
    System.out.printf("Digite quantos dólares você possui: ");
    qtdeDolar= sc.nextDouble(); 
    conversao= qtdeDolar * valorDolar;
    System.out.printf("A conversão do valor de dólares para real é: %.2f", conversao);
    
    }   
}
 

