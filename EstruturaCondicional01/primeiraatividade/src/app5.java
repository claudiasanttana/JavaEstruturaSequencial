 //Faça um programa na Linguagem Java que leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias.

import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = sc.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = sc.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = sc.nextInt();

        sc.close();

        int totalDias = calcularDias(anos, meses, dias);

        System.out.println("A idade é equivalente a " + totalDias + " dias.");
    }

    public static int calcularDias(int anos, int meses, int dias) {
        int totalDias = anos * 365; // Considerando 365 dias por ano
        totalDias += meses * 30;    // Considerando 30 dias por mês (aproximadamente)
        totalDias += dias;

        return totalDias;
    }
}





