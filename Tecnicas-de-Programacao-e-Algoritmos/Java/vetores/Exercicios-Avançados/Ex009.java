package com.core;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<=(vetorA.length -1); i++) {
			System.out.printf("Digite o %d valor: ", i);
			vetorA[i] = scan.nextInt();
		}
		
		boolean ePalindromo = true;
		
		int j=(vetorA.length-1);
		
		for(int i=0; i<=(vetorA.length -1); i++) {
			if(vetorA[i] != vetorA[j]) {
				ePalindromo = false;
			}
			j--;
		}
		
		System.out.println(ePalindromo);
		
		scan.close();
	}

}
/*
Números palíndromos são aqueles que escritos da direita para a esquerda 
têm o mesmo valor quando escritos da esquerda para a direita. Exemplo: 
545; 789987; 97379; 123454321; etc. Escreva um programa que verifique 
se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o 
primeiro elemento do vetor e igual ao último, se o segundo elemento do 
vetor é igual ao penúltimo e assim por diante até verificar todos os 
elementos ou chegar a conclusão que o vetor não é um palíndromo.

*/