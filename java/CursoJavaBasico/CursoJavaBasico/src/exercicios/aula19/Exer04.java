package exercicios.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vectorA = new int[15];
        double[] vectorB = new double[vectorA.length];

        for(int i = 0; i<vectorA.length; i++){
            vectorA[i] = lerInform("Informe o valor da posicao " +(i+1), scan);
        }
        for (int i = 0; i < vectorB.length; i++) {
           vectorB[i] = Math.sqrt(vectorA[i]);
        }

        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        for(int i =0; i<vectorB.length; i++){
            System.out.print(df.format(vectorB[i]) + " ");
        }

        
    }

    private static int lerInform(String mgs, Scanner scan){
        System.out.println(mgs);
        int entrada = scan.nextInt();
        return entrada;
    }
}
