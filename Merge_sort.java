package merge_sort;

import java.util.Random;

public class Merge_sort {

    static int n = 10;

    public static void merge(int[] vetor_1, int left, int right, int pivot) {

        int[] vetor_2 = new int[(left - pivot) -1];
        int[] vetor_3 = new int[right];
        
        
        
        int j = 0;
        int k = 0;

        for (int i = 0; i < vetor_3.length; i++) {

            if ((j < n) && (k < n)) {
                if ((vetor_1[j] < vetor_2[k])) {
                    vetor_3[i] = vetor_1[j++];
                    //j++;
                } else {
                    vetor_3[i] = vetor_2[k++];
                    //k++;
                }
            } else if (j < n) {
                vetor_3[i] = vetor_1[j++];
                //j++;
            } else if (k < n) {
                vetor_3[i] = vetor_2[k++];
                //k++;
            }
        }

    }

    public static void mergeSort(int[] vetor_1, int left, int right) {
        if (left < right) {
            int pivot = (left + right) / 2;
            mergeSort(vetor_1, left, pivot);
            mergeSort(vetor_1, pivot+1, right);
            merge (vetor_1, left, pivot +1, right);
        }
    }

    public static void main(String[] args) {
        Random rdn = new Random();

        int[] vetor_1 = new int[n];

        for (int i = 0; i < vetor_1.length; i++) {
            vetor_1[i] = rdn.nextInt(100);
        }

        //quickSort(vetor_1, 0, n - 1);
        //quickSort(vetor_2, 0, n - 1);
        for (int i = 0; i < vetor_1.length; i++) {
            System.out.print(vetor_1[i] + " ");
        }

        mergeSort(vetor_1, 0, n - 1);

        System.out.println();

    }

}
