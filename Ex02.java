package br.com.generation.exercicios1312;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] valor = new double [10];
		double soma = 0.0;
		double media = 0.0;
		double maior = 0.0;
		int i;
		
		System.out.println("Digite os valores: ");
		
		for(i=0; i<valor.length; i++) {
			System.out.println("\nPosição: " + (i+1) + ":");
			valor[i] = input.nextDouble();
			soma = soma + valor[i];
			media = soma/10;
				if (valor[i]>maior) {
					maior = valor[i];
				}				
			
		}
		
		for (i=0; i<=9; i++) {
			System.out.println(valor[i] + ":");
		}				
		
				
		System.out.println("\nA soma dos valores é: " + soma);
		System.out.println("\nO maior valor é: " + maior);
		System.out.println("\nA média aritmética é: " + media + "\n");		
		
		input.close();
	}	

}
