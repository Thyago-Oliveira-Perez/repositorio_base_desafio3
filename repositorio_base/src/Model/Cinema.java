package Model;

public class Cinema {

    private Long idCinema;
    private String nome;
    private String cnpj;

    public Cinema() {
    }

    public Cinema(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Long getId() {
        return idCinema;
    }

    public void setId(Long id) {
        this.idCinema = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + idCinema +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
