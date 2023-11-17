package com.core;

import java.util.Random;


public class Ex006 {

  public static void main(String[] args) {
    int[] vetorA = new int[20];
    int[] vetorB = new int[20];
    
    Random random = new Random();
    
    for(int i=0; i<=(vetorA.length - 1); i++){
      vetorA[i] = random.nextInt() % 50;
      vetorB[i] = random.nextInt() % 50;
    }
    
    int contadorA = 0;
    int contadorB = 0;
    
    
    //criação de valores aleatórios e entre 0 e 10 para os vetores 
    while(true){
      int numA = random.nextInt() % 50;
      int numB = random.nextInt() % 50;
      
      if((numA > 0 && numA <= 10) && contadorA < vetorA.length){
        vetorA[contadorA] = numA;
        contadorA++;
      }
      if((numB > 0 && numB <= 10) && contadorB < vetorB.length){
        vetorB[contadorB] = numB;
        contadorB++;
      }
      
      if(contadorA== vetorA.length && contadorB==vetorB.length){
        break;
      }
    }
    
    

        int tamanhoC = (vetorA.length < vetorB.length) ? vetorA.length : vetorB.length;
        int[] vetorC = new int[tamanhoC];
        int contadorC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[contadorC++] = vetorA[i];
                    break;
                }
            }
        }

        // APRESENTAÇÃO
        System.out.print("Vetor A: [");
        for(int i=0; i<=vetorA.length -1; i++){
          System.out.print(i==vetorA.length-1 ? vetorA[i]: vetorA[i]+ ", ");
        }
        System.out.println("]");
        
        System.out.print("Vetor B: [");
        for(int i=0; i<=vetorB.length -1; i++){
          System.out.print(i==vetorB.length-1 ? vetorB[i]: vetorB[i]+ ", ");
        }
        System.out.println("]");
        
        System.out.print("Vetor C (Interseção): ");
        for (int k = 0; k < contadorC; k++) {
            System.out.print(vetorC[k] + " ");
        }
  }

}

/*6. Criar dois vetores A e B cada um com 10 Elementos inteiros. Desenvolver
 *um programa que realize a intersecção dos vetores A e B para produzir um
 *vetor C. Interseção de conjuntos = todos os elementos *que existem em A e
 *também existem em B.
 */
 
