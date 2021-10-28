package Controller;

import Model.Cinema;
import Model.Sessao;

import java.util.ArrayList;
import java.util.List;

public class SessaoController {

    public List<Sessao> sessoes = new ArrayList<>();

    public void cadastrar(Sessao sessao){

        if(!idExistente(sessao)){

            sessoes.add(sessao);

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

}
