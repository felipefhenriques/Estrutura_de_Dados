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
public class Ex06_SomaDigitos {
    
    public static void main(String[] args) {
        int n = isInteiroPositivo();
        System.out.println(somaDigitosRec(n));
        
        
    }
    
    public static int somaDigitosIt(int n){
        int acumulador = 0;
        int resto = 0;
        
        while(n > 0){
           resto = n % 10;
           acumulador = acumulador + resto;
           n = n/10; //ataulização
        }
        
        return acumulador;
    }
     
    public static int somaDigitosRec(int n){
        if(n < 10){
            return n;
        }
        
        return somaDigitosRec(n/10) + (n%10);
        
    }
    
}
