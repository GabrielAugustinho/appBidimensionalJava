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
            for (int col = 0; col < vet.length; col++) {
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

    public String dados(int vet[], String msg) {
        String dados = msg + "\n";
        for (int valor : vet) {
            dados += valor + "\t";
        }
        return dados;
    }
    
    public String dados(int mat[][], String msg) {
        String dados = msg + "\n";
        for (int vet[] : mat) {
            for (int j = 0; j < vet.length; j++) {
                dados += vet[j] + "\t";
            }
            dados += "\n";
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
            diagonal[i] = matriz[i][i];
        }
        return diagonal;
    }
    
    public int[] diagonalSecundaria() {
        int[] diagonal = new int[matriz.length];
        int aux = matriz[0].length - 1;
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][aux--];
        }
        return diagonal;
    }

    public int[] somaCadaLinha() {
        int[] soma = new int[matriz.length];
        for (int linha = 0; linha<matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma[linha] += matriz[linha][coluna];
            }
        }
        return soma;
    }
    
    public int[] somaCadaColuna() {
        int[] soma = new int[matriz[0].length];
        
        for(int coluna = 0; coluna < matriz[0].length; coluna++){
            for(int linha = 0; linha < matriz.length; linha++){
                soma[coluna]+=matriz[linha][coluna];
            }
        }
        return soma;
    }
    
    public int[][] transposta(){
        int[][] transposta =new int[matriz[0].length][matriz.length];
        for (int linha = 0; linha<matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                transposta[coluna][linha] = matriz[linha][coluna];
            }
        }
        return transposta;
    }
}
