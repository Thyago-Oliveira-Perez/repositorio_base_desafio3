package DAO;

import Model.Cinema;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CinemaDAO {

    public void cadastrarCinema(List<Cinema> cinemas){
        File cinemaFile = new File("cinema.txt");
        if(!cinemaFile.isFile()){
            try {
                cinemaFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(cinemaFile);
            PrintWriter printWriter  = new PrintWriter(fileWriter);
            for(int i = 0; i < cinemas.size(); i++){
                printWriter.println(cinemas.get(i));
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listarCinema(){}

    public List<Cinema> carregarCinemas() throws IOException {
        List<String> listaDoArquivoCinema = new ArrayList<>();
        List<Cinema> listaDeCinemas = new ArrayList<>();
        Path path = Paths.get("cinema.txt");
        listaDoArquivoCinema = Files.readAllLines(path);
        for(int i = 0; i < listaDoArquivoCinema.size(); i++){
            String cinemaString = listaDoArquivoCinema.get(i);
            String[] dadosCinema = cinemaString.split(";");
            if(isNumeric(dadosCinema[0])){
                long idCinema = (Long.parseLong(dadosCinema[0]));
                Cinema cinema = new Cinema();
                cinema.setId(idCinema);
                cinema.setNome(dadosCinema[1]);
                cinema.setCnpj(dadosCinema[2]);
                listaDeCinemas.add(cinema);
            }
        }
        return listaDeCinemas;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}