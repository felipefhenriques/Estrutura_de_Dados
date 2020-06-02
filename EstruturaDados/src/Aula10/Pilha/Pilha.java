/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10.Pilha;

/**
 *
 * @author felipeferreira
 */
public class Pilha {
    
    private No topo;
    private int tam;
    
    
    //Cria pilha vazia
    public Pilha(){
        this.topo = null;
        this.tam = 0;
    }
    
    //Empilhar
    public void push(Object elemento){
        this.topo = new No(elemento, this.topo);
        tam++;
    }
    
    //Se a pilha está vazia
    public boolean vazia(){
        return this.topo == null;
    }
    
    //Tamanho da pilha
    public int size(){
        return this.tam;
    }
    
    //Desempilhar elemento da lista
    public Object pop () throws Exception{
        if(this.vazia()){
            throw new Exception("Erro: Pilha vazia");
        }
        Object elemento = this.topo.getElemento();
        this.topo = this.topo.getProx();
        this.tam--;
        return elemento;
    }

    @Override
    public String toString() {
       return "Pilha{" + "topo= " + topo + ", tam = " + tam + "}";
    }
    
    
    
    
    
}
