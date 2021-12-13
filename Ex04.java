package br.com.generation.exercicios1312;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double [][] valor = new double [3][3];
		double soma = 0.0;
		double diagonal = 0.0;
		
		int l, c;
		
		System.out.println("Digite os valor da matriz: ");
		
		for (l = 0; l<3; l++) {
			for (c = 0; c<3; c++) {
				
				System.out.printf("Posição: [%d][%d]: ", l, c);
				valor [l][c] = leia.nextDouble();
				soma = soma + valor[l][c];
				diagonal = valor[0][0] + valor[1][1] + valor[2][2];
								
			}
			System.out.println("\n");
		}
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A soma da diagonal principal é: " + diagonal);

	}

}
