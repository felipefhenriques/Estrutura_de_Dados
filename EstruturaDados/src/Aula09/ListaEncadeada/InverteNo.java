/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09.ListaEncadeada;

import Aula06.ListaEncadeada.No;

/**
 *
 * @author felipeferreira
 */
public class InverteNo {
    
    private No ini;
    
    public void inverteLista(){
        No temp = ini;
        No anterior = null;
        No posterior = anterior;
        
        while(temp.getProx()!= null){
            posterior = anterior;
            anterior = temp;
            temp = temp.getProx();
            anterior.setProx(posterior); // Anterior olha pra trás
        }
        ini = temp;
        temp.setProx(anterior);
    }
    
}
