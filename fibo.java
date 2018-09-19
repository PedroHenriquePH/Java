package java;
import java.util.Scanner;
public class fibo {
  
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
  
    public static void main(String[] args) {   
    Scanner tcl = new Scanner(System.in);
    System.out.println("digite um valor");
        int aux = tcl.nextInt();
        int vetor[] = new int[aux];
        for (int i = 0 ; i <= vetor.length ; i++) {
                System.out.print("(" + i + "):" + fibo.fibo(i) + "\t");
            }
  
    }
}
