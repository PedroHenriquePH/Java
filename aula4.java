
package java;
import java.util.Scanner;
public class aula4 {
    public static void main(String [] args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Saldo inicial");
        int saldo = tcl.nextInt();
            System.out.println("Caixa");
            System.out.println("Caixa eletronico");
            System.out.println("1 - ver saldo");
            System.out.println("2 - sacar");
            System.out.println("3 - deposito");
            System.out.println("4 - sair");
            
            Scanner caix = new Scanner(System.in);
            System.out.println("Declare a ação que deseja executar");
            int acao = caix.nextInt();
            if(acao == 0){
                System.out.println("Escolha uma opção");
                System.out.println("Caixa eletronico");
                System.out.println("1 - ver saldo");
                System.out.println("2 - sacar");
                System.out.println("3 - deposito");
                System.out.println("4 - sair");
            }else{
                switch (acao) {
                    case 1: {
                        System.out.println("Caixa eletronico");
                        System.out.println("1 - ver saldo");
                        System.out.println("2 - sacar");
                        System.out.println("3 - deposito");
                        System.out.println("4 - sair");
                        break; 
                    }
                    case 2:{
                        System.out.println("Caixa eletronico");
                        System.out.println("1 - ver saldo");
                        System.out.println("2 - sacar");
                        System.out.println("3 - deposito");
                        System.out.println("4 - sair");
                        break;
                    }
                    case 3:{
                        System.out.println("Caixa eletronico");
                        System.out.println("1 - ver saldo");
                        System.out.println("2 - sacar");
                        System.out.println("3 - deposito");
                        System.out.println("4 - sair");
                        break;
                    }
                    case 4:{
                        
                        System.exit(1);
                        break;
                    }
                }
            }
    }
}
