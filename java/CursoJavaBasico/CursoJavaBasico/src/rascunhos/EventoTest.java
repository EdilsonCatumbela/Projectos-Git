package rascunhos;

import java.util.Scanner;

public class EventoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Evento evento = new Evento();
        System.out.println("Informe o nome do evento");
        evento.setNomeEvento(scan.nextLine());

        System.out.println("Informe o número de convidados"); 
        int n = scan.nextInt();
        Convidado[] convidados = new Convidado[n];
        scan.nextLine();
        for(int i = 0; i<convidados.length; i++){
            Convidado convidado = new Convidado();
            System.out.println("Informe do nome do " +(i+1)+ " convidado");
            convidado.setNome(scan.nextLine());
            System.out.println("Informe o seu rg");
            convidado.setRg(scan.nextLine());

            convidados[i] = convidado; 
        }

        evento.setConvidados(convidados);

        System.out.println("\nEvento: " + evento.getNomeEvento());

        if(evento != null && evento.getConvidados() !=null){

           for(Convidado c: evento.getConvidados()){
                System.out.println("Nome do convidado: " + c.getNome());
                System.out.println("Rg do convidado: " + c.getRg());
            }
        }
        
    }
}
