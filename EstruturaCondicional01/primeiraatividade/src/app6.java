//Faça um programa na Linguagem Java que calcule a área da circunferência. Fórmula= pi*r²

import java.util.Scanner;

public class app6 {
    public static void main(String args[]){
        double r, pi, a;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Digite o valor do raio da circunferência: ");
        r= sc.nextDouble();
        pi= 3.14159;
        a= pi * (r*r);
        System.out.printf("O valor da área da circunferência é: " + a);
    } 
}
    

