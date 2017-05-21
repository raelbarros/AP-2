package quickshort;

import java.util.Random;
import java.util.Scanner;

public class Quickshort {
    static int i;
    static int j;
    
    public static void imprimeVetor(int [] v, int n){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]+ " ");
        }
    }
    
    public static void troca(int [] vetor, int i, int j){
        int tmp;
        tmp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = tmp;
    }
    
    public static void particao(int [] vetor, int pivot){
        while (i < j) {
            while (vetor[i] < pivot)
                i++;
            while (vetor[j] > pivot)
                j--;
            if (i <= j) {
                troca(vetor,i,j);
                i++;
                j--;
            }  

        }
    }

    public static void quickSort(int[] vetor, int left, int right){
        Random rdn = new Random();
        
        i = left; j = right;
       
        //int pivot = vetor[(left+right)/2];
        //int pivot = vetor[left];
        //int pivot = vetor[right];
        //int pivot = vetor[(right-left+1)/3 + left];
        int pivot = vetor[   rdn.nextInt(right-left+1) + left ];
        particao(vetor, pivot);
    
        if (j> left)
            quickSort(vetor, left, j);            
        
        if (i < right)
            quickSort(vetor, i, right);         
    }

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rdn = new Random();
        
//        int n = sc.nextInt();
        int n = 50;
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++){
            v[i] = rdn.nextInt(100);
        }
        
        imprimeVetor(v, n);
        
//        System.out.println("\nValor inicial da divisao:");
//        int left = sc.nextInt();
//        
//        System.out.println("Valor final da divisao:");
//        int right = sc.nextInt();
        
        
//        quickSort(v, left, right);
        quickSort(v, 0, n-1);
        
        
        System.out.println();
        imprimeVetor(v, n);

    }
    
}
