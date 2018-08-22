package java;
import java.util.Random;
public class aula {
    public static void main(String[] args) {
        int vetor[] = new int[100];
         Random numeros = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numeros.nextInt(1000);
            int aux = 0;
        }
        for (int i = 0; i < vetor.length; i++) {
             for (int j = 0; i < vetor.length; j++) 
                 if (vetor[i] < vetor[j]){
                    int aux = vetor [i];
                     vetor [i] = vetor [j];
                     vetor [j] = aux;
            }
             System.out.println("");
             System.out.println("Vetor ordenado");
                for (int j = 0; j < vetor.length; j++) {
                    System.out.println(" ");
                
            }
        }
    } 
}



