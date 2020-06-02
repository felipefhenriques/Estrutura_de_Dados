/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Vetores;

import java.util.Scanner;

/**
 *
 * @author geoinformacao
 */
public class ex04Inverter {
    
    static Scanner valor = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = isInteiroPositivo();
        System.out.println(n + " posições");
        int v[];
        v = leVetor(n);
        exibeVetor(v);
        exibeVetorTam(v, n);
        inverteVetor(v);
        
    }
    
    public static int isInteiroPositivo(){
        int n;
        do{
            System.out.print("Digite um inteiro e positivo: ");
            n = valor.nextInt();
            
        }while(n < 0 || n>1000);
        return n;
    }

    public static int[] leVetor(int n) {
        int[] vetor = new int[n];
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print("v[" + i + "]: ");
            vetor[i] = valor.nextInt();
        }
        return vetor;
    }
    
    public static void exibeVetor(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print("v[" + i + "]:" + v[i] + " ");
        }
    }
    
    public static void exibeVetorTam(int[] v, int n){
        for(int i = 0; i < v.length; i++){
            System.out.println("v[" + i + "]: " + v[i]);
        }
    }
    
    public static void inverteVetor(int v[]){
        
         int ini = 0;
         int fim = v.length -1;
            while (ini < fim){
                int aux = v[ini];
                v[ini] = v[fim];
                v[fim] = aux;
                ini++;
                fim--;
        }
       
            for(int i = 0; i < v.length; i++){
                System.out.println(v[i]);
            }
    }
    
    public static int[] leVetorAleatorio(int n){
        int v[] = new int[n];
        for(int i = 0; i <v.length; i++){
            v[i] = (int) (Math.random()*50);
        }
        
        return v;
    }
    
}
