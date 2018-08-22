
package java;
import java.util.Random;
import java.util.Scanner;
public class aula2 {
        public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            Random aleatorio = new Random();
            int[] vetor = new int[10];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = aleatorio.nextInt(44);
            }
            System.out.println("Digite o valor a ser encontrado:");
                int valor = tcl.nextInt();
            boolean encontrado = false;
            for (int i = 0; i < vetor.length; i++) {
                if(valor == vetor[i]){
                    System.out.println("valor encontrado na posicao "+i);
                    encontrado = true;
                    break;
                }
            }
            if(encontrado == false){
                System.out.println("valor nao encontrado");
            }
        }

}
