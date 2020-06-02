/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10.Pilha;

import java.util.Random;

/**
 *
 * @author felipeferreira
 */
public class Ex02_Pares_Impares {
    
    public static void main(String[] args) throws Exception {
        Pilha pares = new Pilha();
        Pilha impares = new Pilha();
        int[] vetor = Aula02_Vetores.ex04Inverter.leVetorAleatorio(10);
        insere(pares, impares, vetor);
        
        System.out.println("Pilha de pares");
        while(!pares.vazia()){
            System.out.println(pares.pop());
        }
        System.out.println("Pilha de ímpares");
        while(!impares.vazia()){
            System.out.println(impares.pop());
        }
        
    }
    
    static void insere(Pilha pares, Pilha impares, int[] elementos){
       for(int i = 0; i < elementos.length ; i++){
           if(elementos[i] % 2 == 0){
               pares.push(elementos[i]);
           } else {
               impares.push(elementos[i]);
           }
       }
    }
    
}
