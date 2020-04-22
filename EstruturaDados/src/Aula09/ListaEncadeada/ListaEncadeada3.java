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
public class ListaEncadeada3 {
    
    private No ini;
    
    // Criar construtor
    public ListaEncadeada3(){
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
        insereOrdenadoRec(ini, elemento);
    }
    public void insereOrdenadoRec(No temp, int elemento){
        //Lista vazia ou inserir no início
        if(vazia() || ini.getElemento() > elemento){
            No novo = new No(elemento, ini);
            ini = novo;
            // ou fazer insereInicio(elemento);
            return;
        } 
        
        //Insere final
        if(temp.getProx() == null){
            No novo = new No(elemento, null);
            temp.setProx(novo);
            return;
        }
        
        //Inserir entre dois nós
        if(temp.getElemento()< elemento && temp.getProx().getElemento()>= elemento){
            No novo = new No(elemento, ini);
            novo.setProx(temp.getProx());
            temp.setProx(novo);
            return;
        }
        
        insereOrdenadoRec(temp.getProx(), elemento);
        
        
           
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
    
    public void removeInicio(){
        if(vazia()){
            System.out.println("Lista vazia");
        } else {
            // Existe ao menos um nó
            ini=ini.getProx();
        }
    }
    
    public void removeFinal(){
        if(vazia()){
            System.out.println("Lista vazia");
        } else {
            No temp = ini;
            No anterior = null;
            
            while(temp.getProx()!= null){
                anterior = temp;
                temp = temp.getProx();
            }
            // Se a lista tiver apenas um nó
            if(anterior == null){
                ini = null;
            } else {
                anterior.setProx(null);
            }
        }
            
    }
    
    public void removeFinalRec(){
        removeFinalRec(ini);
    }
    public void removeFinalRec(No temp){
        if(vazia()){
            System.out.println("Lista vazia");
            return;
        }
        
        if(ini.getProx()==null){
            ini = null;
        }
        
        if(temp.getProx().getProx()==null){
            temp.setProx(null);
            return;
        }
        
        removeFinalRec(temp.getProx());
    }
    
   public void removeOrdenado(int elemento){
        if(vazia()){
            System.out.println("Lista vazia!");
        } else {
            No temp = ini;
            No anterior = null;
            
            while(temp!=null && temp.getElemento()!=elemento){
                anterior=temp;
                temp=temp.getProx();
            }
            //Se a lista tem apenas um nó
            if(anterior==null){
                ini=ini.getProx(); //1. remove do início
            } else {
                if (temp!=null && temp.getElemento()==elemento){
                    anterior.setProx(temp.getProx());
                } else {
                    System.out.println(elemento + " NAO está na lista");
                }
            }
        }   
    }

    
    public int quantidadeNos(){
        No no = ini;
        int contador = 0;   
        if(vazia()){
            System.out.println("A lista está vazia");
        } else {
            while (no!= null){
                no = no.getProx();
                contador ++;
            }
        }
        return contador;
    }
    
    public No minNo(){
        No temp = ini;
        No min = temp;
        while(temp.getProx()!= null){
            if(temp.getElemento() < min.getElemento()){
                min = temp;
            }
            temp = temp.getProx();
        }
        return min;
    }

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
