package exercicios.aula17;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, res;
        numero = lerInfom("Tabuada de: ", scan);
     
        
        for (int i = 0; i <= 10; i++) {
            res = numero * i;
            System.out.println(numero+ " x "+i+" = "+res);
        }
    }

    private static int lerInfom(String mgs, Scanner scan){
        System.out.print(mgs);
        int entrada = scan.nextInt();

        return entrada;
    }
    
    
}
