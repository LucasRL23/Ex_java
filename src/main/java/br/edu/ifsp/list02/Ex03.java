package br.edu.ifsp.list02;

import java.util.Arrays;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int size = 5;
    }

    String compute(int[] firstFive, int[] otherInts) {

        int[] array = new int[10];
        int size = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (firstFive[i] == firstFive[j]) return "Erro";
            }
            array[size++] = firstFive[i];
        }

        String result = print(array, size);

        for (int num : otherInts) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (array[i] == num) {
                    pos = i;
                    break;
                }
            }

            if (pos != -1) {
                for (int i = pos; i < size - 1; i++)
                    array[i] = array[i + 1];
                size--;
            } else {
                if (size == 10) break;
                array[size++] = num;
            }

            if (size == 0) break;

            result += "\n" + print(array, size);

            if (size == 10) break;
        }
        return result;
    }

    private String print(int[] array, int size) {
        String linha = "";
        for (int i = 0; i < size; i++) {
            linha += array[i];
            if (i < size - 1) linha += " ";
        }
        return linha;
    }
}


