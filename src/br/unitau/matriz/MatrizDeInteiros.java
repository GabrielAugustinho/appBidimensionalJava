package br.unitau.matriz;

import java.util.Random;

public class MatrizDeInteiros {

    private int matriz[][];

    public MatrizDeInteiros(int linha, int coluna) {
        matriz = new int[linha][coluna];
    }

//    public void setMatriz() {
//        Random valor = new Random();
//        for (int lin = 0; lin < matriz.length; lin++) {
//            for (int col = 0; col < matriz[lin].length; col++) {
//                matriz[lin][col] = valor.nextInt(10);
//            }
//        }
//    }
//ou
    public void setMatriz() {
        Random valor = new Random();
        for (int vet[] : matriz) {
            for (int col : vet) {
                vet[col] = valor.nextInt(10);
            }
        }
    }

    public boolean ehQuadrada() {
        return matriz.length == matriz[0].length;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int getTotLin() {
        return matriz.length;
    }

    public int getTotCol() {
        return matriz[0].length;
    }

    public String dados(int vet[], String msg){
        String dados = msg+"\n";
        for(int valor:vet){
            dados+=valor+"\t";
        }
        return dados;
    }
    
    public String dados() {
        String dadosMatriz = "Valores armazenados na matriz\n";

        for (int vet[] : matriz) {
            for (int j = 0; j < vet.length; j++) {
                dadosMatriz += vet[j] + "\t";
            }
            dadosMatriz += "\n";
        }

        return dadosMatriz;

    }

    public int[] diagonalPrincipal() {
        int[] diagonal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i]=matriz[i][i];
        }
        return diagonal;
    }   
}
