package java;
import java.util.Scanner;
public class aula3 {
    public static void main(String [] args){
        Scanner tcl = new Scanner (System.in);
        int vetor [] = new int[10];
        System.out.println("Digite os valores desejados");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            int p = vetor[i];
            for (int j = i - 1; j >= 0 && vetor [j] > p; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = p;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" " + vetor[i]);
        }
    }
}
