package DAO;

import Model.Cinema;
import Model.Sessao;

import java.io.*;
import java.util.ArrayList;
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

    public List<Sessao> carregaSessoes() throws IOException {

        File sessaoFile = new File("sessoes.txt");

        if(!sessaoFile.isFile()){
            try {
                sessaoFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fileReader = new FileReader(sessaoFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> pegaString = new ArrayList<>();
        List<Sessao> sessao = new ArrayList<>();

        String linha = " ";

        while((linha = bufferedReader.readLine()) != null) {
            if(linha != null) {
                pegaString.add(linha);
            }
        }

        fileReader.close();
        bufferedReader.close();

        for (String i: pegaString) {
            String[] section = i.split(";");

            Sessao sessoes = new Sessao();

            sessoes.setIdSessao(Long.valueOf(section[0]));
            sessoes.setDataEHora(section[1]);
            sessoes.setIdCinema(Long.valueOf(section[0]));

            sessao.add(sessoes);
        }
        return sessao;
    }
}
