/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04.Recursividade;

import static Aula02_Vetores.ex04Inverter.isInteiroPositivo;

/**
 *
 * @author felipe.fhenriques
 */
public class Ex04_ProdutoAeB {
    
    public static void main(String[] args) {
        int a = isInteiroPositivo();
        int b = isInteiroPositivo();
        
        System.out.println(produto(a, b));
        
    }
    
    public static  int produto(int a, int b){
        if(b ==1){
            return a;
        }
        
        return produto(a, b-1) + a;
    }
    
}
