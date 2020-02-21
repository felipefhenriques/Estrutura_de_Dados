/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02.Vetores;

import static Aula02.Vetores.ex04Inverter.exibeVetor;
import static Aula02.Vetores.ex04Inverter.isInteiroPositivo;
import static Aula02.Vetores.ex04Inverter.leVetorAleatorio;

/**
 *
 * @author geoinformacao
 */
public class ex07_buscaLinear {
    
    public static void main(String[] args) {
        
        int n1 = isInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);
        int n = 10;
        int buscaLinear = buscaLinear(v1, n);
        System.out.println(buscaLinear);
    }
    
    public static int buscaLinear(int[] v, int n){
        int retorno = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                //System.out.println("O elemento está na posição " + i);
                return i;
            }    
        }
         return -1; 
    }
}
