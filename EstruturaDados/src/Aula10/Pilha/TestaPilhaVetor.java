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
public class TestaPilhaVetor {
    public static void main(String[] args) throws Exception {
        Pilha_Vetor p = new Pilha_Vetor(10);
        System.out.println(p.vazia());
        p.push(3);
        p.push(5);
        p.push(7);
        System.out.println(p.vazia());
        System.out.println("remove "+p.pop());
        System.out.println("remove "+p.pop());
        System.out.println("tamanho "+p.size());
        System.out.println("remove "+p.pop());
        System.out.println(p.vazia());
    }
}
