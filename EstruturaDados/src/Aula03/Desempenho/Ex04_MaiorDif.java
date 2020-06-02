/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03.Desempenho;

import static Aula02_Vetores.ex04Inverter.exibeVetor;
import static Aula02_Vetores.ex04Inverter.isInteiroPositivo;
import static Aula02_Vetores.ex04Inverter.leVetorAleatorio;

/**
 *
 * @author felipe.fhenriques
 */
public class Ex04_MaiorDif {
    
    public static void main(String[] args) {
        int n = isInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        int[] dif = MaiorDif(v);
        System.out.println("\nOs valores que trazem maior idferença são: ");
        imprimir(dif);
        
        
    }
    
     public static int[] MaiorDif(int[] v){
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
        int[] resp = new int[2];
        resp[0] = v[imaior];
        resp[1] = v[imenor];
        return resp;
    }
     
     static void imprimir(int[] v){
         for(int i = 0 ; i < v.length ; i++){
             System.out.print(v[i] + " ");
         }
     }
}
