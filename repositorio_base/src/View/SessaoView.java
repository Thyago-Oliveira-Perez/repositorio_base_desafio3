package View;

import Controller.SessaoController;
import Model.Cinema;
import Model.Sessao;

import java.util.Scanner;

public class SessaoView {

    Scanner entrada = new Scanner(System.in);
    SessaoController sessaoController = new SessaoController();

     public void cadastrarSessao(Long idCinema){

         Sessao sessao = new Sessao();

         System.out.print("Digite o ID:");
         sessao.setIdSessao(entrada.nextLong());

         entrada.nextLine();

         System.out.print("Digite a data e hora da sessao:");
         sessao.setDataEHora(entrada.next());

         entrada.nextLine();

         System.out.print("Id do Cinema.");
         sessao.setIdCinema(idCinema);

         System.out.println("Sessao cadastrada com sucesso! \n" + sessao);
         sessaoController.cadastrar(sessao);

     }

    public void listarSessoes(){

        System.out.println(sessaoController.getSessoes());

    }
    public void listarSessoesByIdCinema(Long idCinema){

        System.out.println(sessaoController.getSessoesByIdCinema(idCinema));

    }

}
