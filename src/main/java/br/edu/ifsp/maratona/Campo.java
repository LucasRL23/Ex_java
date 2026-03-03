package br.edu.ifsp.maratona;

import java.util.Scanner;

public class Campo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N,M;
        N = leitor.nextInt();
        M = leitor.nextInt();
        int[][] matriz = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matriz[i][j] = leitor.nextInt();
            }
        }
        int linhaMaior = 0;
        int colunaMaior = 0;
        for(int i = 0; i < N; i++){
            int valor = 0;
            for(int j = 0; j < M; j++){
                valor += matriz[i][j];
            }
            if(linhaMaior < valor){
                linhaMaior = valor;
            }
        }
        for(int i = 0; i < M; i++){
            int valor = 0;
            for(int j = 0; j < N; j++){
                valor += matriz[j][i];
            }
            if(colunaMaior < valor){
                colunaMaior = valor;
            }
        }
        if(linhaMaior < colunaMaior){
            System.out.println(colunaMaior);
        }else{
            System.out.println(linhaMaior);
        }
    }
}
