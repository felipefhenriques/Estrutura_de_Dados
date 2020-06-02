/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10.Pilha;

import java.util.Scanner;

/**
 *
 * @author felipeferreira
 */
public class Ex_BemFormado {
    
    static Scanner valor = new Scanner (System.in);
    
    public static void main(String[] args) throws Exception {
        
        Pilha p = new Pilha(); 
        System.out.println("Digite uma sequência de () e []: ");
        String sequencia = valor.nextLine();
        System.out.println("A pilha está bem formada? " + bemFormado(sequencia, p));
        
    }
    
    static boolean bemFormado(String sequencia, Pilha p) throws Exception{
        for(int i = 0; i < sequencia.length(); i++){
            char c = sequencia.charAt(i);
            
            //Se for de abertura
            if (c == '[' || c == '('){
                p.push(c);
            } else {
                //Se for de fechamento
                //Verificar se a pilha está vazia
                if(p.vazia()){
                    return false;
                } 
                char charTopo = (char) p.pop();
                
                if (charTopo == '(' && c == ']'){
                    return false;
                }
                if (charTopo == '['&& c == ')'){
                    return false;
                }
                
                
            }
            
        }
        
        
        if(p.vazia()){
                return true;
            } else {
                return false;
            }
        
    }
    
    
    
    
    
}
