package exercicios.aula17;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validarUsuario = false;
        

        while(!validarUsuario){
            String nomeuUser = lerInform("Entre com o nome do usuário", scan);
            String senhaUser = lerInform("Entre com a senha do usuário", scan);

            if(senhaUser.equalsIgnoreCase(nomeuUser)){
                System.out.println("Usuário inválido, tenta novamente.");
            }else{
                System.out.println("Login efectuado com sucesso\n" + "Usuário: " + nomeuUser + "\nSenha: " + senhaUser);
                validarUsuario=true;
            }
        }
        
    }

    private static String lerInform(String mgs, Scanner scan){
        System.out.println(mgs);
        String entrada = scan.nextLine();

        return entrada;
    }
}
