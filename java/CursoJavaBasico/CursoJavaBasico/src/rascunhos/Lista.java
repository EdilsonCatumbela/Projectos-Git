package rascunhos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Lista {
    private static Scanner scan;
    private static int n;

    public static void main(String[] args) {
        int[] notas = new int[4];
        ArrayList lista = new ArrayList<>();
        scan = new Scanner(System.in);
        Random rd = new Random();
        opcao();
        while (n !=0) {

            if(n==1){
                String nomeCompleto = lerInform("Informe o nome completo da pessoa", scan);
                lista.add(nomeCompleto);
                for(int i = 0; i<notas.length; i++){
                    notas[i] = rd.nextInt(20);
                    lista.add(notas[i]);
                }
                
                
                opcao();
            }else if(n==2){
                System.out.println();
                System.out.println(lista);
                opcao();
            }else{
        
            System.out.println("Opção inválida, tenta novamente");
            opcao();
            }
        }

        System.out.println("Voçê digitou 0, sistema finalizado. Até logo...");
    }

    private static String lerInform(String mgs, Scanner scan){
        System.out.println(mgs);
        String entrada = scan.nextLine();

        return entrada;
    }

    private static int lerInformInt(String mgs, Scanner scan) {
        System.out.println(mgs);
        int entrada = scan.nextInt();

        return entrada;
    }

    private static void opcao(){
        n = lerInformInt("Prima 0 para [Sair], 1 para [Adicionar] pessoa a lista, 2 para ler a Lista[2]", scan);
        scan.nextLine();
    }
}
