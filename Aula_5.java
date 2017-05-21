package aula_5;

import java.util.Scanner;

public class Aula_5 {

    public static int binarySearch(int vet[], int n, int chave){
        int inicio, fim, pivo, aux = 0;
        
        
        inicio = 0;
        fim = n-1;
                
        while (inicio <= fim){
            pivo = (inicio + fim) / 2;
            System.out.println("Interação atual inicio = " + inicio + ", meio = "+ pivo +", fim "+ fim);
            
            
            if (vet[pivo] == chave){
                System.out.println("Total de interações  = " +aux);
                return pivo;
            }
                        
            else if (chave < vet[pivo]){
               fim = pivo -1 ;
            }
            
            else {
                inicio = pivo +1;
            }
            aux ++;
        }
        System.out.println("Total de interações = " + aux);
        return -1;
    }

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = 10;
        int [] vet = new int [n];
        int busca, chave;
        
         for (int i = 0; i <= n-1; i++)
            vet[i] = i*2 + 5;       
        
         
        for (int i = 0; i < n; i++)
            System.out.print(vet[i]+ " ");
        
        System.out.println(" ");
        System.out.print("Digite a chave: ");
        chave = s.nextInt();
        
        busca = binarySearch(vet, n, chave);
        
        if (busca > -1)
            System.out.println("A posicao da chave "+ chave + " = "+ busca);
        
        else
            System.out.println("A busca Falhou");
        
    }
    
}
