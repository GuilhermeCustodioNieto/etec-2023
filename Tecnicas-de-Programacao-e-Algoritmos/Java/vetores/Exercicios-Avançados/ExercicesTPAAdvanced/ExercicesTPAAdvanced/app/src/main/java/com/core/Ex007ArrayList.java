package com.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex007ArrayList {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    final int TAMANHO_ARRAY = 5;
    
    // LEITURA DOS 2 VETORES
    List<Integer> vetorA = new ArrayList<>();
    List<Integer> vetorB = new ArrayList<>();
    List<Integer> vetorC = new ArrayList<>();
    
    
    for (int i = 0; i <= (TAMANHO_ARRAY - 1); i++) {
      System.out.printf("Digite o %dº numero do vetor A: ", i + 1);
      vetorA.add(scan.nextInt());

      System.out.printf("Digite o %dº numero do vetor B: ", i + 1);
      vetorB.add(scan.nextInt());
    }
    
    for(Integer valor : vetorA){
      if(vetorB.contains(valor) == false && vetorC.contains(valor) == false){
        vetorC.add(valor);
      }
    }
    
    System.out.println("Os valores que tem intersecção são: ");
    int syzeVectC = (vetorC.size() - 1);
    for(Integer valor : vetorC){
    	
      System.out.print(valor == vetorC.get(syzeVectC) ? valor : valor + ", ");
    }
    
    scan.close();
  }
}
/*6. Criar dois vetores A e B cada um com 10 Elementos inteiros. Desenvolver
 *um programa que realize a intersecção dos vetores A e B para produzir um
 *vetor C. Interseção de conjuntos = todos os elementos *que existem em A e
 *também existem em B.
 */
