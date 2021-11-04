import Controller.CinemaController;
import Model.Cinema;
import Model.Sessao;
import View.CinemaView;
import View.SessaoView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CinemaView cinemaView = new CinemaView();
        SessaoView sessaoView = new SessaoView();

        cinemaView.carregarCinemas();
        cinemaView.menuCinema();

//        sessaoView.cadastrarSessao(Long.valueOf(01));
//        sessaoView.listasSessoesArq();

    }

}
