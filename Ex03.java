package br.com.generation.exercicios1312;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c<6; c++) {
				
				System.out.println("Digite o valor de N1: ");
				n1[l][c] = leia.nextInt();
				System.out.println("Digite o valor de N2:");
				n2[l][c] = leia.nextInt();				
			}
			System.out.println("\n");
		}
		for (int l=0; l<4;l++) {
			for (int c =0; c<6; c++) {
				m1[l][c] = n1[l][c] + n2 [l][c];
				System.out.print(m1[l][c] + " |");
			}
			System.out.println("\n");
		}
		System.out.println("------------------------" + "\n");
		
		for(int l=0; l<4; l++) {
			for(int c=0; c<6; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.print(m2[l][c] + " |");
			}
			System.out.println("\n");
			leia.close();
		}
		
	}

}
