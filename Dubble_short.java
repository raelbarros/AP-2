package dubble_short;
import java.util.Random;
public class Dubble_short {
    public static void main(String[] args) {
        Random rdn = new Random(); 
        
        int aux;
        int n = 10;
        int [] vet = new int [10];
        
        for (int i = 0; i < n; i++)
            vet[i] = rdn.nextInt(20);
        
        System.out.println("Vetor Original");
        for (int i = 0; i < n; i++)
            System.out.print(vet[i]+ " ");
        
        for (int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if (vet[i] > vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;                                                                                                        
                }
            } 
        }
        
        System.out.println();
        System.out.println("Vetor Ordenador");
        for (int i = 0; i < n; i++)
            System.out.print(vet[i]+ " ");
    }
    
}
