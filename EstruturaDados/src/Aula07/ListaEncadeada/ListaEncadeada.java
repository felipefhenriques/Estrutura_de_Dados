    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07.ListaEncadeada;

import Aula06.ListaEncadeada.No;

/**
 *
 * @author felipeferreira
 */
public class ListaEncadeada {
    private No ini;
    
    // Criar construtor
    public ListaEncadeada(){
        this.ini = null;
    }
    
    // Verifica se a lista está vazia
    public boolean vazia(){
        return ini == null;
    }
    
    public void insereInicio(int elemento){
        No novo = new No(elemento, ini);
        ini = novo;
    }
    
    public void insereFinal(int elemento){
        No novo = new No(elemento, null);
        No temp = ini ;

        if(temp==null){
            ini = novo;
        } else {
        //Percorrer até chegar no último nó
        while (temp .getProx()!= null){
            temp = temp.getProx();
        }
            }
        
        temp.setProx(novo);
    }
    
    public void insereFinalRec(int elemento){
        insereFinalRec(ini, elemento);
    }
    public void insereFinalRec(No temp, int elemento){
        if(temp==null){
            No novo = new No(elemento, ini);
            ini = novo;
        } else {
            if(temp.getProx() == null){
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
            insereFinalRec(temp.getProx(), elemento);
         }
        }
    }
    
    
    public void insereOrdenado(int elemento){
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;
        
        while (temp != null && temp.getElemento()<novo.getElemento()){
        anterior = temp;
        temp = temp.getProx(); 
        }
        
        if(anterior == null){
            // Lista vazia
            ini = novo;   
        } else {
            novo.setProx(temp);
            anterior.setProx(novo);
        }
        
    }
    
    public void insereOrdenadoRec(int elemento){
        insereOrdenadoRec(null, ini, elemento);
    }
    public void insereOrdenadoRec(No anterior, No temp, int x){
        //Lista vazia
        if(temp == null){
            No novo = new No(x, ini);
            ini = novo;
        } else {
            No novo = new No(x, null);
            //Inserir entre dois nós
            if(anterior != null && temp.getElemento()>novo.getElemento()){
                novo.setProx(temp);
                anterior.setProx(novo);
            } else {
                //Inserir no inicio
                if(anterior == null && temp.getElemento()>novo.getElemento()){
                novo.setProx(ini);
                ini = novo;
            } else {
                //Inserir no final 
                if(anterior== null && temp == null){
                anterior.setProx(novo);
                } else {
                //Atualização de variáveis
                insereOrdenadoRec(temp, temp.getProx(), x);
                }
            }
         }
        }
    }
    
    public boolean buscaLinear(int x){
        No temp = ini;
        
        while(temp != null){
            if(temp.getElemento() == x){
                return true;
            }
            temp = temp.getProx();
        }
        return false;
    }
    
    public No buscaLinear2(int x){
        No temp = ini;
        
        while(temp != null){
            if(temp.getElemento() == x){
                return temp;
            }
            temp = temp.getProx();
        }
        return null;
    }
    
    public boolean buscaLinearRec(int x){
        return buscaLinearRec(ini, x);
    }
    public boolean buscaLinearRec(No temp, int x){
        if(temp == null){
            return false;   
        }
        if(temp.getElemento() == x){
            return true;
        }
        return buscaLinearRec(temp.getProx(), x);
    }
    
    public No buscaLinearRec2(int x){
        return buscaLinearRec2(ini, x);
    }
    public No buscaLinearRec2(No temp, int x){
        if(temp == null){
            return null;  
        }
        if(temp.getElemento() == x){
            return temp;
        }
        return buscaLinearRec2(temp.getProx(), x);
    }

    @Override
    public String toString() {
        String strLista= " ";
        No temp = ini;
        
        while (temp != null){
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }
    
    
    
    
    
    
}
