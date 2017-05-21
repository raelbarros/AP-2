package aula_8;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Aula_8 {

//------------------------------------------------------------------------------
public static void bubbleSortA1(int[] vetor, int n) {
  int aux;
  for(int i=n-1; i>=0; i--)
    for(int j=0; j<n-1; j++)
      if(vetor[j] > vetor[j+1]) {
        aux        = vetor[j];
        vetor[j]   = vetor[j+1];
        vetor[j+1] = aux;
      }
}

//------------------------------------------------------------------------------
public static void bubbleSortA2(int[] vetor, int n) {
  int aux;
  for(int i=n-1; i>=0; i--)
    for(int j=0; j<i; j++)
      if(vetor[j] > vetor[j+1]) {
        aux        = vetor[j];
        vetor[j]   = vetor[j+1];
        vetor[j+1] = aux;
      }
}

//------------------------------------------------------------------------------
public static void bubbleSortA3(int[] vetor, int n) {
  int aux;
  for(int i=0; i<n-1; i++){
    for(int j=i+1; j<n; j++){
      if(vetor[i] > vetor[j]){
        aux      = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
      }
    }
  }
}

//------------------------------------------------------------------------------
public static void bubbleSortB1(int[] vetor, int n) {
  boolean trocou = true;
  int aux;
  while(trocou) {
    trocou = false;
    for(int i=0; i<n-1; i++)
      if(vetor[i] > vetor[i+1]) {
        aux        = vetor[i];
        vetor[i]   = vetor[i+1];
        vetor[i+1] = aux;
        trocou     = true;
      }
  }
}

//------------------------------------------------------------------------------
public static void bubbleSortB2(int[] vetor, int n) {
  boolean trocou = true;
  int aux;
  while(trocou) {
    n--;
    trocou = false;
    for(int i=0; i<n; i++)
      if(vetor[i] > vetor[i+1]) {
        aux        = vetor[i];
        vetor[i]   = vetor[i+1];
        vetor[i+1] = aux;
        trocou     = true;
      }
  }
}

//------------------------------------------------------------------------------
public static void bubbleSortB3(int[] vetor, int n) {
  int ultima = n-1;
  int aux;
  while(ultima!=0) {
    n      = ultima;
    ultima = 0;
    for(int i=0; i<n; i++)
      if(vetor[i] > vetor[i+1]) {
        aux        = vetor[i];
        vetor[i]   = vetor[i+1];
        vetor[i+1] = aux;
        ultima     = i;
      }
  }
}

//------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner Entrada   = new Scanner(System.in);
        Random  Aleatorio = new Random();

        int n;
//      System.out.print("Digite o valor de N: ");
//      n = Entrada.nextInt();
        n = 10;
        int[] vetor = new int[n];

        for (int i=0; i<n; i++)
//          vetor[i] = n-i;
            vetor[i] = Aleatorio.nextInt(n/4) + 1;

        System.out.println("\nVetor original:");
        for (int i=0; i<n; i++)
            System.out.print(vetor[i] + " ");

        bubbleSortA1 (vetor,n);
//        bubbleSortA2 (vetor,n);
//        bubbleSortA3 (vetor,n);
//        bubbleSortB1 (vetor,n);
//        bubbleSortB2 (vetor,n);
//        bubbleSortB3 (vetor,n);

        System.out.println("\nVetor de saida:");
        for (int i=0; i<n; i++)
            System.out.print(vetor[i] + " ");

        System.out.println("");
    } // main

}