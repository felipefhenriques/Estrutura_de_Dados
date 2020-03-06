/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04.Recursividade;

import static Aula02.Vetores.ex04Inverter.isInteiroPositivo;

/**
 *
 * @author felipe.fhenriques
 */
public class Ex05_Potencia {
    
    public static void main(String[] args) {
        int base = isInteiroPositivo();
        int exp = isInteiroPositivo();
        System.out.println(potencia(base,exp));
        
        
    }
    
    public static int potencia(int base, int exp){
        if(exp == 1){
            return base;
        }
        
        
        return potencia (base, (exp-1)) * base;
    }
    
}
