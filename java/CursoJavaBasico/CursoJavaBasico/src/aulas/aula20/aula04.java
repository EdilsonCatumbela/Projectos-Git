package aulas.aula20;

import java.util.Scanner;

public class aula04 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Entre o número de pessoas que serão entrevistadas");
      int numEntrevistados = scan.nextInt();

      String[][] nomesFIlhos = new String[numEntrevistados][];
s
      for(int i = 0; i<nomesFIlhos.length; i++){
          System.out.println("Entre com a quantidade de filho");
          int qtdFilhos = scan.nextInt();
          scan.nextLine();
          nomesFIlhos[i] = new String[qtdFilhos];
          
          for(int j=0; j<nomesFIlhos[i].length; j++){
            System.out.println("Digite o nome do filho " +(j+1));

            nomesFIlhos[i][j] = scan.nextLine();

          }
      }

      for(int i = 0; i<nomesFIlhos.length; i++){
          System.out.println();
          System.out.println("Pessoa " + (i+1) + " tem " + nomesFIlhos[i].length + " filhos");
          for(int j=0; j<nomesFIlhos[i].length; j++){
              System.out.println((j+1)+"- "+nomesFIlhos[i][j]);
          }
      }
    }
}
