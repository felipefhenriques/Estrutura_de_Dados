/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02.Vetores;


import static Aula02.Vetores.ex07_buscaLinear.buscaLinear;


/**
 *
 * @author geoinformacao
 */
public class ex08_Inters_Uniao {
    
    public static void main(String[] args) {
        
        ex04Inverter aula02  = new ex04Inverter();
        
        int n1 = aula02.isInteiroPositivo();
        int v1[] = aula02.leVetorAleatorio(n1);
        aula02.exibeVetor(v1);
        
        int n2 = aula02.isInteiroPositivo();
        int v2[] = aula02.leVetorAleatorio(n2);
        aula02.exibeVetor(v2);
        
        int inter[] = new int[v1.length];
        int nInter = inters2Vetores(v1, v2, inter);
        aula02.exibeVetor(inter);
        exibeVetorTam(nInter);
        
        int uniao[] = new int[v1.length + v2.length];
        int uniao2Vetores = uniao2Vetores(v1, v2, uniao);
        aula02.exibeVetor(uniao);
    }

    private static int inters2Vetores(int[] v1, int[] v2, int[] inter) {
        int k = 0;
        for(int i = 0; i < v1.length; i++){
            if (buscaLinear(v2, v1[i]) != -1){
                inter[k] = v1[i];
                k++;
            }
            
        }
        return k;
    }

    private static void exibeVetorTam(int nInter) {
        System.out.println("Possui " + nInter + " posições");
    }
    
    public static int uniao2Vetores(int[] v1, int[] v2, int[] v3){
        int k = 0;
        
        for(int i = 0; i < v1.length; i++){
            v3[k] = v1[i];
            k++;
        }
        
        for (int i = 0; i < v2.length; i++){
            if (buscaLinear(v1, v2[i]) == -1){
                v3[k] = v2[i];
                k++;
            }
        }
        return k;
    }
    
    
    
}
