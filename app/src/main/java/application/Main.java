package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] valores = new int[5];

        for(int cont = 0;cont < valores.length;cont++) {
            try {
                System.out.println("Digite um número inteiro:");
                Scanner sc = new Scanner(System.in);
                valores[cont] = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Tipo inválido");
                cont--;
            }
        }

        System.out.print("Valores: ");
        for(int val : valores) {
            System.out.print(val + " ");
        }
    }
}

