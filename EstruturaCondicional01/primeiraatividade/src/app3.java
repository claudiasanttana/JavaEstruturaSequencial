/*Faça um programa na Linguagem Java que leia uma temperatura em graus Fahrenheit e apresentá-la convertida em
 graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a 
 temperatura em Celsius.*/

import java.util.Scanner;

public class app3 {
     public static void main (String args[]){
        double c,f;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Digite um valor em graus Fahrenheit: ");
        f= sc.nextDouble();
        c= (f-32)* 5/9;
        System.out.printf("O valor da temperatura em celcius para F° é: " + c);

    }
}
    

