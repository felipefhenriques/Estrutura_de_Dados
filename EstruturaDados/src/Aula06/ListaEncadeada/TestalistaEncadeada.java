/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.ListaEncadeada;

import Aula07.ListaEncadeada.ListaEncadeada;

/**
 *
 * @author felipeferreira
 */
public class TestalistaEncadeada {
    
    public static void main(String[] args) {
//        No p = new No(7, null);
//        System.out.println(p);
//        System.out.println(p.getElemento());
//        No q = new No(5,p);
//        System.out.println(q);
//        No r = new No(9,q);
//        System.out.println(r);

          ListaEncadeada list = new ListaEncadeada();
          System.out.println(list.vazia());
          
          list.insereInicio(34);
          list.insereInicio(21);
          list.insereInicio(7);
          list.insereFinal(45);
          list.insereFinal(67);
          list.insereOrdenado(3);//Inserir no incio
          list.insereOrdenado(40);
          list.insereOrdenado(85);
          System.out.println(list);
          System.out.println(list.buscaLinear(21));
          System.out.println(list.buscaLinear(42));
          System.out.println(list.buscaLinear2(21));
          System.out.println(list.buscaLinearRec2(21));
          
          list.insereFinalRec(90);
          list.insereFinalRec(95);
          System.out.println(list);
          list.insereOrdenadoRec(1);
          list.insereOrdenadoRec(56);
          list.insereOrdenadoRec(102);
          System.out.println(list);
    }
    
    
    
    
    
}
