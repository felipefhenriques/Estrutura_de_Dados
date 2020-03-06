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
public class Ex08_09_Divisao {
    
    public static void main(String[] args) {
        int x = isInteiroPositivo();
        int y = isInteiroPositivo();
        System.out.println("\nResto da divisão de " + x + " por " + y + " é " + restoDiv(x,y));
        System.out.println("");
        System.out.println("Quociente divisão de " + x + " por " + y + " é " + quocienteDiv(x, y));
        System.out.println("");
    }
    
    public static int restoDiv(int x, int y){
        
        if(x <  y){
            return x;
        }
        
        return restoDiv(x - y, y);
        
    }
    
    public static int quocienteDiv(int x, int y){
        
        if (x <y){
            return 0;
        }
        
        return quocienteDiv(x-y, y) + 1;
        
    }
    
    
    
    
    
    
    
    
}
