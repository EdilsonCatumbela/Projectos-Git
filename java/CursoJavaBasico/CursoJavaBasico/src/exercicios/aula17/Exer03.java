package exercicios.aula17;

import java.util.Scanner;

public class Exer03 {
    private static Scanner scan;
    public static void main(String[] args) {
    scan = new Scanner(System.in);
    
    String nome = lerInfom("Informe o nome", scan);
    while (nome.length()<3){
        System.out.println("Nome inválido, digite um nome com pelo três caracteres");
        nome = lerInfom("Informe o nome", scan);
        
    }

    int idade = lerInfomInt("Informe a idade", scan);
    while ((idade < 0) || (idade > 150)){
        System.out.println("Idade inválido, digite uma idade entre 0 e 150");
        idade = lerInfomInt("Informe a idade", scan);
    }
    double salario = lerInfomDouble("Informe o salário", scan);
    while (salario <= 0) {
        System.out.println("Salário inválido, digite um salário maior do zero");
        salario = lerInfomDouble("Informe o salário", scan);
    }
    scan.nextLine();
    String sexo = lerInfom("Informe o sexo", scan);
    while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
        System.out.println("sexo inválido, digite um sexo m para masculino e f para femenino");
        sexo = lerInfom("Informe o sexo", scan);
        
    }

    String estadoCivil = lerInfom("Informe o estado civil", scan);
    while (!estadoCivil.equalsIgnoreCase("s") && 
           !estadoCivil.equalsIgnoreCase("c") &&
           !estadoCivil.equalsIgnoreCase("v") &&
           !estadoCivil.equalsIgnoreCase("d")           
           ) {
        System.out.println("sexo inválido, digite s para solteiro, c para casado, v para viuvo e d para divorciado");
        estadoCivil = lerInfom("Informe o estado civil", scan);

    }
    
        
    }

    private static String lerInfom(String mgs, Scanner scan){
        System.out.println(mgs);
        String entrada = scan.nextLine();
        return entrada;
    }

    private static int lerInfomInt(String mgs, Scanner scan){
        System.out.println(mgs);
        int entrada = scan.nextInt();
        return entrada;
    }

    private static double lerInfomDouble(String mgs, Scanner scan) {
        System.out.println(mgs);
        double entrada = scan.nextDouble();
        return entrada;
    }
}
