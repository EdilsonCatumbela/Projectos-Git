package aulas.aula20;

import java.util.Random;

public class aula20 {
    public static void main(String[] args) {
        int[][] notas = new int[30][4];
        Random ran = new Random();

        for(int i =0; i<notas[i].length; i++){
            for(int j = 0; j<notas[j].length; j++){
                notas[i][j] = ran.nextInt(20);
            }
        }

        for(int i = 0; i<notas[i].length; i++){
            for(int j = 0; j<notas[j].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média do aluno");
        double soma;
        for(int i =0; i<notas.length; i++){
            soma =0;
            for(int j = 0; j<notas[i].length; j++){
                soma+=notas[i][j];
            }
            System.out.print("Media do aluno "  + i + " é = " +(soma/4)+" ");

            if ((soma/4)>=10){
                System.out.print(" - Aprovado");
            }else{
                System.out.print(" - Reprovado");
            }

            System.out.println();
        }
    }
}
