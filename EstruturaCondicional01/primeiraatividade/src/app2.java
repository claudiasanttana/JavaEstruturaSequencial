/*Faça um programa na Linguagem Java que leia uma temperatura em graus Celsius e apresentá-la convertida em 
 graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C
 a temperatura em Celsius.*/

import java.util.Scanner;

public class app2 {
     public static void main (String args[]){
        double c,f;
        Scanner sc= new Scanner (System.in);
        System.out.printf("Digite uma temperatura em graus celcius: ");
        c= sc.nextDouble();
        f= (9 * c + 160) / 5;
        System.out.printf("O valor em celsius convertido para fahrenheit é: " + f);

    }
}
    

