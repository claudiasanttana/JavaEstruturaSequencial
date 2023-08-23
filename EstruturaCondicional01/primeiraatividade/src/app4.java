/*Faça um programa na Linguagem Java  para calcular e apresentar o valor do volume de uma lata de óleo, 
utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA.*/

import java.util.Scanner;

public class app4 {
    public static void main (String arg[]){
        double volume, raio, altura;
        Scanner sc= new Scanner (System.in);
        System.out.printf("Digite o raio da lata: ");
        raio = sc.nextDouble();
        System.out.printf("Digite o valor da altura da lata: ");
        altura = sc.nextDouble();
        volume= 3.14159 * (raio*raio) *altura;
        System.out.printf("O valor do volume da lata é: " + volume);  
    }
}
    

