package exercicios.aula19;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vectorA = new int[10]; 
        int[] vectorB = new int[vectorA.length];
        int[] vectorC = new int[vectorB.length];

        for(int i=0; i<vectorA.length; i++){
            vectorA[i] = lerInfom("Informa o valor da posição " +(i+1)+" do vector A", scan);
        }

        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = lerInfom("Informa o valor da posição " + (i + 1) + " do vector B", scan);
        }

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] =vectorA[i] + vectorB[i];
        }
        for (int i = 0; i < vectorA.length; i++) {
           System.out.print(vectorA[i] +" ");
        }
        System.out.println();

        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i] + " ");
        }
    }

    private static int lerInfom(String mgs, Scanner scan){
        System.out.println(mgs);
        int entrada = scan.nextInt();

        return entrada;
    }
}
