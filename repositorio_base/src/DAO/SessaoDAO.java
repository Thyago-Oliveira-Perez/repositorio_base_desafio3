package DAO;

import Model.Cinema;
import Model.Sessao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SessaoDAO {

    public void cadastrarSessao(List<Sessao> sessoes){

        File sessaoFile = new File("sessoes.txt");

        if(!sessaoFile.isFile()){

            try {
                sessaoFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            FileWriter fileWriter = new FileWriter(sessaoFile);
            PrintWriter printWriter  = new PrintWriter(fileWriter);

            for(int i = 0; i < sessoes.size(); i++){

                printWriter.println(sessoes.get(i));

            }

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
