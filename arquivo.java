package java;
public class arquivo {
    public static void main (String[] args){
        String matriz[][] = new String [4][3];
        matriz [0][0] = "123";
        matriz [0][1] = "Lousa";
        matriz [0][2] = "R$:300";
        
        matriz [1][0] = "165";
        matriz [1][1] = "Garrafa";
        matriz [1][2] = "R$:20";
        
        matriz [2][0] = "134";
        matriz [2][1] = "Óculos";
        matriz [2][2] = "R$:100";
        
        matriz [3][0] = "145";
        matriz [3][1] = "Teclado";
        matriz [3][2] = "R$:5000";
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.println(" ");
            }
        }
        
    }
}
