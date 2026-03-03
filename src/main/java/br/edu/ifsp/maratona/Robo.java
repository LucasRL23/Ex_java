package br.edu.ifsp.maratona;

import java.util.Scanner;

public class Robo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        int A = sc.nextInt() - 1;
        int B = sc.nextInt() - 1;

        int[][] matriz = new int[L][C];

        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int i = A;
        int j = B;

        int pi = -1;
        int pj = -1;

        while(true){
            boolean moveu = false;
            if(i + 1 < L && matriz[i+1][j] == 1 && !(i+1 == pi && j == pj)){
                pi = i;
                pj = j;
                i++;
                moveu = true;
            }
            else if(i - 1 >= 0 && matriz[i-1][j] == 1 && !(i-1 == pi && j == pj)){
                pi = i;
                pj = j;
                i--;
                moveu = true;
            }
            else if(j + 1 < C && matriz[i][j+1] == 1 && !(i == pi && j+1 == pj)){
                pi = i;
                pj = j;
                j++;
                moveu = true;
            }
            else if(j - 1 >= 0 && matriz[i][j-1] == 1 && !(i == pi && j-1 == pj)){
                pi = i;
                pj = j;
                j--;
                moveu = true;
            }

            if(!moveu) break;
        }
        System.out.println((i+1) + " " + (j+1));
    }
}
