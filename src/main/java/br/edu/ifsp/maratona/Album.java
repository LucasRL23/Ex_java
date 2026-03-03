package br.edu.ifsp.maratona;

import java.util.Scanner;

public class Album {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int C = leitor.nextInt();
        int M = leitor.nextInt();
        int contador = C;
        int[] X = new int[C];
        int[] Y = new int[M];

        for (int i = 0; i < C; i++) {
            X[i] = leitor.nextInt();
        }
        for (int i = 0; i < M; i++) {
            Y[i] = leitor.nextInt();
        }
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < M; j++) {
                if (X[i] == Y[j]) {
                    contador--;
                    break;
                }
            }
        }
        System.out.print(contador);
    }
}

