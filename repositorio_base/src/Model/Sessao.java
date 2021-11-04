package Model;

public class Sessao {

    private Long idSessao;
    private String dataEHora;
    private Long idCinema;

    public Sessao() {
    }

    public Sessao(String dataEHora, Long idCinema) {
        this.dataEHora = dataEHora;
        this.idCinema = idCinema;
    }

    public Long getIdSessao() {
        return idSessao;
    }
    public void setIdSessao(Long idSessao) {
        this.idSessao = idSessao;
    }
    public String getDataEHora() {
        return dataEHora;
    }
    public void setDataEHora(String dataEHora) {
        this.dataEHora = dataEHora;
    }
    public Long getIdCinema() {
        return idCinema;
    }
    public void setIdCinema(Long idCinema) {
        this.idCinema = idCinema;
    }
    @Override
    public String toString() {
        return idSessao + ";" + dataEHora + ";" + idCinema;
    }
}
