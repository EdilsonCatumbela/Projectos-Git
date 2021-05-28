package exercicios.aula19;

import java.util.Scanner;




public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vectorA = new int[8];
        int[] vectorB = new int[vectorA.length];
        
        for(int i = 0; i<vectorA.length; i++){
            vectorA[i] = lerInfom("informe o valor da posição " + (i + 1), scan);
        }

        for(int i = 0; i<vectorA.length; i++){
            System.out.print(vectorA[i] + " ");
        }

        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = 2 * vectorA[i];
        }

        System.out.println();
        for (int i = 0; i < vectorA.length; i++) {
              System.out.print(vectorB[i] + " ");
        }

       
     
    }

    private static int lerInfom(String mgs, Scanner scan){
        System.out.println(mgs);
        int entrada = scan.nextInt();
        return entrada;
    }
}
