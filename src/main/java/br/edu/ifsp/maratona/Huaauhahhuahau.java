package br.edu.ifsp.maratona;

import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String engracada = sc.nextLine();
        String vogais = "";

        for (int i = 0; i < engracada.length(); i++) {
            char c = engracada.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais += c;
            }
        }

        String normal = vogais;
        String reversa = "";

        for (int i = vogais.length() - 1; i >= 0; i--) {
            reversa += vogais.charAt(i);
        }

        if (normal.equals(reversa)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
