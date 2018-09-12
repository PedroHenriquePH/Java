
import java.util.Scanner;

public class caixa02 {

    public static void main(String[] args) {
        double saldo = 0;
        Scanner tcl = new Scanner(System.in);
        caixa02 tec = new caixa02();

        int funcao = 1;
        while (true) {
            tec.menu();
            System.out.println(" ");
            funcao = tcl.nextInt();
            switch (funcao) {
                case 1:
                    tec.saldo(saldo);
                    break;
                case 2:
                    saldo = tec.sacar(saldo);
                    break;
                case 3:
                    saldo = tec.depositar(saldo);
                    break;
                case 4:
                    tec.sair();
                    break;
            }
        }
    }

    public void menu() {
        
        System.out.println("1- ver saldo");
        System.out.println("2 - sacar");
        System.out.println("3 - depositar");
        System.out.println("4 - sair");
    }

    public void saldo(double saldo) {
        System.out.printf("Seu saldo é de" + saldo);
    }

    public double sacar(double saldo) {
        System.out.println("Digite  valor que deseja sacar");
        Scanner tcl = new Scanner(System.in);
        double quantidade = tcl.nextDouble();
        return saldo - quantidade;

    }

    public double depositar(double saldo) {
        System.out.println("Digite o valor que deseja depositar");
        Scanner tcl = new Scanner(System.in);
        double quantidade = tcl.nextDouble();
        return saldo + quantidade;
    }
    public void sair(){
        System.exit(0);
    }
}
