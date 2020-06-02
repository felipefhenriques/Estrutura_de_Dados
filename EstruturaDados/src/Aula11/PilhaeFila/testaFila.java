/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11.PilhaeFila;

/**
 *
 * @author felipeferreira
 */
public class testaFila {
    
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(12);
        System.out.println(q);
        System.out.println("Tamanho da fila: " + q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("Tamanho da fila: " + q.size());
        System.out.println("Tamanho da fila2: " + q.size2());
        
    }
    
}
