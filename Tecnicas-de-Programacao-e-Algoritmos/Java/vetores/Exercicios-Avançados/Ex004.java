package com.core;

public class Ex004 {

  public static void main(String[] args) {

    double[] vetorA = new double[11];

    double resultPotencia = 2;

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      if(i==0){
        resultPotencia = Math.pow(resultPotencia, 2);
      } else{
        resultPotencia = Math.pow(resultPotencia,vetorA[i-1]);
      }
      
      vetorA[i] = resultPotencia;
    }

    for (double atual : vetorA) {
      System.out.println(atual);
    }
  }
}

/*4. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada
*elemento do vetor A é formado pela potência de base 2 elevado ao expoente
*igual a posição do respectivo elemento, ou seja:
*A[i] = 2i
.
*/
