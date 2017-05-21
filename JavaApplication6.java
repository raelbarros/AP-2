package javaapplication6;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication6 {
    public static void imprimeVetor(int [] v, int n){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]+ " ");
        }
    }
    public static void quickSort(int[] vetor, int left, int right)
{
    int i = left, j = right;
    int tmp;
    int pivot = vetor[(left+right)/2];
    while (i < j) {
        while (vetor[i] < pivot)
            i++;
        while (vetor[j] > pivot)
            j--;
        if (i <= j) {
            tmp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = tmp;
            i++;
            j--;
        }
    }
    if (j> left)
        quickSort(vetor, left, j);
    if (i < right)
        quickSort(vetor, i, right);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdn = new Random();
        
        int n = sc.nextInt();
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++){
            v[i] = rdn.nextInt(10);
        }
        
        imprimeVetor(v, n);
        
        System.out.println("\nValor inicial da divisao:");
        int left = sc.nextInt();
        
        System.out.println("Valor final da divisao:");
        int right = sc.nextInt();
        
        
        quickSort(v, left, right);
        
        
        System.out.println();
        imprimeVetor(v, n);


    }
    
}
