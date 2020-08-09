/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula13.Arvore;

/**
 *
 * @author felipeferreira
 */
public class ABB {
    
    private No raiz;
    
    //Cria uma árvore vazia
    public ABB(){
        this.raiz = null;
    }
    
    public void insere(int elemento) {
        No pai = null;
        No p = raiz;
        No novo = new No(elemento, null, null);

        while (p != null) {
            pai = p;
            if (elemento < p.getElemento()) 
                p = p.getEsq();
             else 
                p = p.getDir();
            
        }

        if (pai == null) 
            raiz = novo;
         else 
            if (elemento < pai.getElemento()) 
            pai.setEsq(novo);
         else 
            pai.setDir(novo);
        
    }

    public void insereR(int elemento) {
        No novo = new No(elemento, null, null);

        if (raiz == null) {
            raiz = novo;
        } else {
            insereR(raiz, novo);
        }

    }

    private void insereR(No p, No novo) {
        if (novo.getElemento() < p.getElemento()) 
            if (p.getEsq() == null) //Se for folha
                p.setEsq(novo);
            else 
                insereR(p.getEsq(), novo);
        else 
            if (p.getDir() == null) //Se for folha
                p.setDir(novo);
            else 
                insereR(p.getDir(), novo);
    }
    
    
    public void preOrdem(){
        preOrdem(raiz);
    }
    
    private void preOrdem(No p){
        if(p!= null){
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }
    
    public void inOrdem(){
        inOrdem(raiz);
    }
    
    private void inOrdem(No p){
        if(p!= null){
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " ");
            inOrdem(p.getDir());
        }
    }
    
    public void posOrdem(){
        posOrdem(raiz);
    }
    
    private void posOrdem(No p){
        if(p!= null){
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }
    
    public No buscaIt(int elemento){
        No p = raiz;
        
        while(p!=null){
            if(elemento == p.getElemento())
                return p;
            if(elemento < p.getElemento())
                p = p.getEsq();
            else
                p = p.getDir();
        }
        return null;
    }
    
    public No buscaR(int elemento){
        return buscaR(raiz, elemento);
    }
    
    public No buscaR(No p, int elemento){
        if(p == null)
            return null;
        if(elemento == p.getElemento())
            return p;
        
        if (elemento < p.getElemento())
            return buscaR(p.getEsq(), elemento);
        else 
            return buscaR(p.getDir(), elemento);       
    }
    
    public int contaNos(){
        return contaNos(raiz);
    }
    
    private int contaNos(No p){
        if(p == null)
            return 0;
        
        return contaNos(p.getEsq()) + contaNos(p.getDir()) + 1;
    }
    
    public int altura(){
        return altura(raiz);
    }
    
    private int altura(No p){
        if (p == null)
            return -1;
        int alturaE = altura(p.getEsq());
        int alturaD = altura(p.getDir());
        if (alturaE >= alturaD)
            return alturaE + 1;
         else 
            return alturaD + 1;
        
    }
 
    public void inOrdemFolha(){
        inOrdemFolha(raiz);
    }
    
    private void inOrdemFolha(No p){
        if(p!= null){
            inOrdemFolha(p.getEsq());
            if(p.getEsq() == null && p.getDir() == null)
                System.out.print(p.getElemento() + " ");
            inOrdemFolha(p.getDir());
        }
    } 
    
    public No menorIt(){
        No p = raiz;
        while(p.getEsq() != null){
            p = p.getEsq();
        }
        return p;
    }
    
    public No menorR(){
        return menorR(raiz);
    }
    
    private No menorR(No p){
        if (p.getEsq() == null){
            return p;
        }
        return menorR(p.getEsq());
    }
    
    public No maiorR(){
        return maiorR(raiz);
    }
    
    private No maiorR(No p){
        if(p.getDir() == null){
            return p;
        }
        return maiorR(p.getDir());
    }
    
    
    //Método que remove um nó na ABB
    public No remove(int elemento){
        return remove(raiz,elemento);
    }
    
    public No remove(No p, int elemento){
        if (p==null)
            return null; //Não achei
        
        if (elemento<p.getElemento())
            p.setEsq(remove(p.getEsq(),elemento));
        else if (elemento>p.getElemento())
            p.setDir(remove(p.getDir(),elemento));
        else {
             //elemento==p.getElemento()
             //Verifica se o elemento será removido tem subárvore esquerda
             if (p.getEsq()!=null){
                //busca o maior na subárvore esquerda
                No aux = maiorR(p.getEsq());
                //Copia o elemento maior da subarv esq para p
                p.setElemento(aux.getElemento());
                //Remove elemento copiado recursivamente
                p.setEsq(remove(p.getEsq(),aux.getElemento()));
              }
             //Verifica se o elemento será removido tem subárvore direita
               else if (p.getDir()!=null){
                //busca o menor na subárvore direita
                No aux = menorR(p.getDir());
                //Copia o elemento menor da subarv dir para p
                p.setElemento(aux.getElemento());
                //Remove elemento copiado recursivamente
                p.setDir(remove(p.getDir(),aux.getElemento()));
                }
               else 
                   //Verifica se é folha
                   return null;
            }
            return p;
        }
    
    public No sucessor(No p){
        if(p.getDir() != null)
            return menorR(p.getDir());
        
        
        return ancestralDireita(p);
    }
    
    private No ancestralDireita(No p){
        No sucessor = null;
        No temp = raiz;
        
        while(temp.getElemento() != p.getElemento()){
            if(p.getElemento() < temp.getElemento()){
                sucessor = temp;
                temp = temp.getEsq();
            } else {
                temp.getDir();
            }
        }
        return sucessor;
    }
    
    public No antecessor(No p){
        if(p.getDir() != null){
            return menorR(p.getDir());
        }
        
        return ancestralEsquerda(p);
    }
    
    private No ancestralEsquerda(No p){
        No antecessor = null;
        No temp = raiz;
        
        while(temp.getElemento() != p.getElemento()) {
            if(p.getElemento()<temp.getElemento()){
                antecessor = temp;
                temp = temp.getDir();
            } else {
                temp = temp.getEsq();
            }
        }
        return antecessor;
    }

    @Override
    public String toString() {
        return "ABB{" + "raiz=" + raiz + '}';
    }
    
}
