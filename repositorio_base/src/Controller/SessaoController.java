package Controller;

import DAO.SessaoDAO;
import Model.Cinema;
import Model.Sessao;

import java.util.ArrayList;
import java.util.List;

public class SessaoController {

    public List<Sessao> sessoes = new ArrayList<>();
    public SessaoDAO sessaoDAO = new SessaoDAO();

    public void cadastrar(Sessao sessao){

        if(!idExistente(sessao)){

            sessoes.add(sessao);
            sessaoDAO.cadastrarSessao(sessoes);

        }else{

            System.out.println("Cadastre outro Id.");

        }

    }

    public boolean idExistente(Sessao sessao){

        for(int i = 0; i < sessoes.size(); i++){

            if(sessoes.get(i).getIdSessao() == sessao.getIdSessao()){

                System.out.println("Esse ID já existe.");
                return true;
            }
        }
        return false;
    }

    public List<Sessao> getSessoesByIdCinema(Long idCinema){

        List<Sessao> sessoesCinema = new ArrayList<>();

        for(int i = 0; i < this.sessoes.size(); i++){

            if(sessoes.get(i).getIdCinema() == idCinema){

                sessoesCinema.add(sessoes.get(i));

            }

        }

        return sessoesCinema;
    }

    public List<Sessao> getSessoes() {

        return this.sessoes;

    }
}
