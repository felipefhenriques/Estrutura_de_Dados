/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03.Desempenho;

import static Aula02_Vetores.ex04Inverter.exibeVetor;
import static Aula02_Vetores.ex04Inverter.isInteiroPositivo;
import static Aula02_Vetores.ex04Inverter.leVetor;
import static Aula02_Vetores.ex04Inverter.leVetorAleatorio;

/**
 *
 * @author felipe.fhenriques
 */
public class Ex06_InterOrdenada {
    
    public static void main(String[] args) {
        
        int n = isInteiroPositivo();
        int v1[] = leVetor(n);
        //exibeVetor(v1);
        System.out.println("");
        int v2[] = leVetor(n);
        //exibeVetor(v2);
        System.out.println("\nA intersecção é: ");
        InterOrdenada(v1, v2);
        System.out.println("");
        
    }
    
   public static void InterOrdenada(int[] v1, int [] v2){
       int i = 0;
       int j = 0;
       
       while(i < v1.length && j < v2.length){
           if(v1[i] == v2[j]){
               System.out.print(v1[i] + " ");
               i++;
               j++;
           }else{
               if(v1[i] < v2[j]){
                   i++;
               }
               else{
                   j++;
               }
           }
       }
   }
    
}
