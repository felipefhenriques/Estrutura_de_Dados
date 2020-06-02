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
public class Ex04_Inverter {
    static Scanner valor = new Scanner (System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um texto que finaliza com ponto: ");
        String texto = valor.nextLine();
        System.out.println("Texto com letras invertidas: ");
        System.out.println(inverter(texto));
    }
    
    public static String inverter(String texto) throws Exception{
       String invertido = "";
       Pilha p = new Pilha();
       
       for (int i = 0; i < texto.length(); i++){
           char character = texto.charAt(i);
           
           if(character == ' ' || character == '.'){
               while(!p.vazia()){
                   invertido += p.pop();
               }
               invertido += character;
           } else {
               p.push(character);
           }
       }
       
       return invertido;
    }
    
}
