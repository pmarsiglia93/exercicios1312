package br.com.generation.exercicios1312;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double [] notas = new double [5];
		double maior = 0.0;
		
		System.out.println("Digite 5 valores: ");
				
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Posição " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
				if (notas[i]>maior) {
					maior = notas[i];
				}
			
		}
			System.out.println("\nO maior valor é: " + maior);
			entrada.close();
	}	

}
