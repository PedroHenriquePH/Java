package java;
import java.util.Scanner;
public class aula5 {
    public static void main(String [] ags){
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[5];
        System.out.println("insira os numerais para o vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = tcl.nextInt();
        }
        int aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vetor[i] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                
                }
            }
        }
            System.out.println(" ");
            System.out.println("Vetor ordenado");
            for (int k = 0; k < 5; k++) {
                System.out.println(vetor[k]+"\t");
        }
            int fim = vetor[4];
            int meio = vetor[3];
            int começo = vetor[0];
            System.out.println(fim);
            System.out.println("Digite o numero que quer encontrar");
                int encontrar = tcl.nextInt();
                if (encontrar > meio) {
                    System.out.println("O numeal esta apos o centro");
                }else{
                    System.out.println("O numeral esta antes do centro");
                }
        
    }
}
