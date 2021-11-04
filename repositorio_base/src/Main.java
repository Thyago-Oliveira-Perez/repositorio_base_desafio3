import Controller.CinemaController;
import Model.Cinema;
import Model.Sessao;
import View.CinemaView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CinemaView cinemaView = new CinemaView();

        cinemaView.carregarCinemas();
        cinemaView.menuCinema();

    }

}
