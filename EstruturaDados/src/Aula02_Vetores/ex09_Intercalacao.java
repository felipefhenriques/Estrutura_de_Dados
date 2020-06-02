/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Vetores;

import static Aula02_Vetores.ex04Inverter.exibeVetor;
import static Aula02_Vetores.ex04Inverter.isInteiroPositivo;
import static Aula02_Vetores.ex04Inverter.leVetorAleatorio;

/**
 *
 * @author geoinformacao
 */
public class ex09_Intercalacao {
    
    public static void main(String[] args) {
        
        int n1 = isInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);
        bubbleSort(v1);
        
        
        int n2 = isInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);
        bubbleSort(v2);
        
        int intercala[] = new int[v1.length+v2.length];
        intercala2Vetores(v1,v2, intercala);
        System.out.println("Intercalação:"); exibeVetor(intercala);
        
    }
    
    
  public static int[] bubbleSort(int[] vetor){
      for(int i = 0; i < vetor.length - 1; i ++)//n - 1 vezes{
          for(int j = 0; j < vetor.length - 1 - i; j++ ){
              if(vetor[j] > vetor[j +1]){
                  int aux = vetor[j];
                  vetor[j] = vetor[j + 1];
                  vetor[j+1] = aux;
              }
      }
     return vetor;
 }   
  
  public static void intercala2Vetores(int[] v1, int[] v2, int [] v3){
      int i = 0, j = 0, k = 0;
      while(i < v1.length && j < v2.length){
          if(v1[i] < v2[j]){
              v3[k] = v1[i];
              i++;
              k++;
          }
          else{
              v3[k] = v2[j];
              j++;
              k++;
          }
      }
      
      while (i < v1.length){
        v3[k] = v1[i];
        i++;
        k++;
      }
      
      while (j < v2.length){
          v3[k] = v2[j];
          j++;
          k++;
      }
      
  }
    
    
    
}
