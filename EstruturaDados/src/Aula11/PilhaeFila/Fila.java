/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11.PilhaeFila;

import Aula10.Pilha.No;

/**
 *
 * @author felipeferreira
 */
public class Fila {
    private No first;
    private No last;
    
    public Fila(){
        this.first = null;
        this.last = null;
    }
    
    
    //Verifica se está vazio
    public boolean isEmpty(){
        return this.first == null && this.last == null;
    }
    
    //Faz inserção no final
    public void enqueue (Object x){
        No novo = new No(x, null);
        
        //
        if(isEmpty()){
            this.first = novo;
            this.last = novo;
        }
        
        //Se tiver mais de um nó no final da fila
        if(this.last != null){
            this.last.setProx(novo);
            this.last = novo;
            return;
        }
        
    }
    
    
    public Object dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Erro: ");
        } 
        Object elemento = this.first.getElemento();
        this.first = this.first.getProx();
        
        return elemento;
    }
    
    public int size(){
        No temp = this.first;
        int count = 0;
        while(temp!=null){
            temp = temp.getProx();
            count++;
        }
        return count;
    }
    
    public int size2(){
        No temp;
        int count =1;
        for(temp = this.first; temp != last; temp = temp.getProx()){
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Fila{" + "first=" + first + ", last=" + last + '}';
    }
    
    
    
    
}
