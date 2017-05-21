package insertion_sort;
import java.util.*;
public class Insertion_sort {
        
    public static void imprimeVetor(int [] v, int n){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]+ " ");
        }
    }
    
    public static int minimo(int[] v,int i, int n) {
        int minimo = Integer.MAX_VALUE;
        int x = 0;
        for (  ; i < n; i++) {
            if (v[i] < minimo) {
                minimo = v[i];
                x = i;
            }

        }
        return x;
    }
    
    public static int maximo(int[] v, int n){
        int maximo =  Integer.MIN_VALUE;
        int x = 0;
        for (int i =0; i < n; i++){
            if (v[i] > maximo){
                maximo = v[i];
                x = i;
            }
        }
        return x;
    }
        
    public static void selectionMin(int [] v, int n){
        for (int i = 0; i < v.length; i++){
            int indice = minimo(v, i ,n);
            int menor = v[indice];            
            v[indice] = v[i];
            v[i] = menor;
           
        }
    }
    
    public static void selectionMax(int [] v, int n){
        for (int i = n-1; i >= 0; i--){
            int indice = maximo(v, i+1);
            int maior = v[indice];            
            v[indice] = v[i];
            v[i] = maior;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdn = new Random();
        
        int n = sc.nextInt();
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++){
            v[i] = rdn.nextInt(100);
        }
        
        imprimeVetor(v, n);
        
        System.out.println("\n Minimo: ");
               
        selectionMin(v, n);
        imprimeVetor(v, n);
        
        System.out.println("\n Maximo");
        
        selectionMax(v, n);
        imprimeVetor(v, n);        
        
        
        
    }

}
