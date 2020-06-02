/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11.PilhaeFila;

import Aula02_Vetores.ex04Inverter;
import Aula10.Pilha.Pilha;


/**
 *
 * @author felipeferreira
 */
public class Ex03_Dec2Bin {
    static ex04Inverter obj = new ex04Inverter();
    
    public static void main(String[] args) throws Exception {
        int decimal = obj.isInteiroPositivo();
        System.out.println(decimal + " == " + dec2bin(decimal) );
    }
    
    private static String dec2bin(int decimal) throws Exception{
        Pilha p = new Pilha();  
        String binario = "";
        
        while(decimal>0){
            int resto = decimal%2;
            p.push(resto);
            decimal = decimal/2;
         }
        
        while(!p.vazia()){
            binario = binario + p.pop();
        }
        return binario;
    }
    
}
