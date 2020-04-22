/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09.ListaEncadeada;

/**
 *
 * @author felipeferreira
 */
public class TestaListaEncadeada3 {
    public static void main(String[] args) {
        ListaEncadeada3 list = new ListaEncadeada3();
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
          System.out.println("Inserido no final: ");
          System.out.println(list);
          // -------
          list.insereOrdenadoRec(1);
          list.insereOrdenadoRec(56);
          list.insereOrdenadoRec(102);
          System.out.println("Inseridos de forma ordenada: ");
          System.out.println(list);
          System.out.println("Remover do início: ");
          list.removeInicio();
          System.out.println(list);
          System.out.println("Remover do final: ");
          list.removeFinal();
          System.out.println(list);
          System.out.println("Remover ordenado ");
          list.removeOrdenado(3); // remove inicio
          list.removeOrdenado(40); // remove meio
          list.removeOrdenado(90); // remove final
          // list.removeOrdenado(30); // remove sem estar na lista
          System.out.println(list);
          System.out.println("Remover no final recursivo");
          list.removeFinalRec();
          System.out.println(list);
          System.out.println("Quantidade de nós: " + list.quantidadeNos());
          
          System.out.println("O menor elemento da lista é: " + list.minNo().getElemento());
          
          list.inverteLista();
          System.out.println("A inversão da lista é"+list);
    }
    
    
}
