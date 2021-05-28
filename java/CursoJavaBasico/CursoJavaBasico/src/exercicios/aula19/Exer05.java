package exercicios.aula19;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vectorA = new int[10];
        int[] vectorB = new int[vectorA.length];

        for(int i = 0; i<vectorA.length; i++){
            vectorA[i] = lerinform("informe o valor da posição " + (i+1), scan);
        }

        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] =vectorA[i]*i;
        }

      
        for(int i =0; i<vectorA.length; i++){
            System.out.print(vectorA[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i]+" ");
        }

    }

    private static int lerinform(String mgs, Scanner scan){
        System.out.println(mgs);
        int entrega = scan.nextInt();
        return entrega;
    }
}
