/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11.PilhaeFila;

import Aula10.Pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author felipeferreira
 */
public class Ex05_Palindrommo {
    static Scanner valor = new Scanner (System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.println("Digite uma palavra: ");
        String palavra = valor.nextLine().toUpperCase();
        String pInvertida = palavraInvertida(palavra);
        System.out.println("Palavra invertida = " + pInvertida);
        if(pInvertida.equals(palavra)){
            System.out.println(palavra + " é palíndromo");
        } else {
            System.out.println(palavra + " não é palíndromo");
        }
    }
    
    static String palavraInvertida(String palavra) throws Exception{
        Pilha p = new Pilha();
        String inverte="";
        for (int i = 0; i < palavra.length(); i ++){
            char character = palavra.charAt(i);
            p.push(character);
        } 
        while(!p.vazia()){
            inverte += p.pop();
        }
        return inverte;
    }
}
