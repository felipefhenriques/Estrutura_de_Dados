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
public class Pilha_Vetor {
    
    private Object item[];
    private int topo;
    
    //Criar pilha vazia
    public Pilha_Vetor(int tamMax){
        this.item = new Object[tamMax];
        this.topo = 0;
    }
    
    //Empilhar
    public void push(Object elemento) throws Exception{
        if(this.topo == this.item.length){
            throw new Exception ("Erro: a pilha está cheia");
        }
        this.item[this.topo++] = elemento;
    }
    
    //Verifica se a pilha está vazia
    public boolean vazia(){
        return this.topo == 0;
    }
    
    //Desempilhar elemento do topo
    public Object pop () throws Exception{
        if(this.vazia()){
            throw new Exception ("Erro: A pilha está vazia");
        }
        this.topo--;
        return this.item[this.topo];
    }
    
    public int size(){
        return this.topo;
    }
}
