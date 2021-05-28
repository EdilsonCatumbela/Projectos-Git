package exercicios.aula17;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor 
seja inválido e continue pedindo até que o usuário informe um valor válido.
*/
public class Exer01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validarNota = false;
        
        do{
            double nota = lerInform("informe a nota", scan);
        if(nota>=0 && nota<=10){
            System.out.println("A nota digitada é " + nota);
            validarNota = true;
        }else{
            System.out.println("Nota inválida, tenta novamente.");
      
        }
        } while (!validarNota);       
        
    }

    private static double lerInform(String mgs, Scanner scan){
        System.out.println(mgs);
        double entrada = scan.nextDouble();
        return entrada;
    }
}