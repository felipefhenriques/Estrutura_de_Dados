/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03.Desempenho;

import static Aula02.Vetores.ex04Inverter.exibeVetor;
import static Aula02.Vetores.ex04Inverter.isInteiroPositivo;
import static Aula02.Vetores.ex04Inverter.leVetorAleatorio;

/**
 *
 * @author felipe.fhenriques
 */
public class Ex03_TrocaPosicao {
    
    public static void main(String[] args) {
        int n = isInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        trocaMaiorMenor(v);
        System.out.println("\nVetor trocado: ");
        exibeVetor(v);
        System.out.println("");
        
        
        
    }
    
    
    public static void trocaMaiorMenor(int[] v){
        int imaior = 0;
        int imenor = 0;
        int aux;
        for(int i = 1; i < v.length ; i++){
            if(v[i] > v[imaior]){  
                imaior = i;
            }
            else{
                if(v[i] < v[imenor]){
                imenor = i;
                }
            }
        }
         
         aux = v[imaior];
         v[imaior] = v[imenor];
         v[imenor] = aux;
        
    }
}
