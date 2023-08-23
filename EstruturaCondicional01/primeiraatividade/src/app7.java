
/* Faça um programa na Linguagem Java para efetuar o cálculo e a apresentação do valor de uma prestação em 
atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).*/

import java.util.Scanner;

public class app7 {
     public static void main (String args[]){
        double valor, taxa, tempo, prestacao;
        Scanner sc= new Scanner (System.in);
        System.out.printf("Digite o valor da compra: ");
        valor= sc.nextDouble();
        System.out.printf("Digite o valor da taxa: ");
        taxa= sc.nextDouble();
        System.out.printf("Digite o tempo de atraso em dias: ");
        tempo= sc.nextDouble();
        prestacao= valor + (valor * (taxa/100) * tempo);
        System.out.printf("O valor da prestação em atraso será:" + prestacao);
    }
    
}
    

