package exercicios.aula19;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = leInform("Informe o temanho do vector", scan);
        int[] vectorA = new int[tamanho];
        int[] vectorB = new int[vectorA.length];

       
        for(int i = 0; i<vectorA.length; i++){
            vectorA[i] = leInform("informe do valor  da posição " + (i+1) , scan);
            vectorB[i] = vectorA[i];
            
        }
       
        for(int i=0; i<vectorA.length; i++){
            System.out.print(vectorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorB[i] + " ");
        }
        
    }

    private static int leInform(String mgs, Scanner scan){
        System.out.println(mgs);
        int entrada = scan.nextInt();
        return entrada;
    }
}
