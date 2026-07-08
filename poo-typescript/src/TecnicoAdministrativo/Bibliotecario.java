package TecnicoAdministrativo;

import Endereco.Endereco;
import java.util.List;

public class Bibliotecario extends TecnicoAdministrativo {

    private String setor = "";

    public Bibliotecario(String nome, String sobrenome, String sexo, String CPF, int idade,
                         boolean brasileiro, List<Endereco> enderecos, String setor) {
        super(nome, sobrenome, sexo, CPF, idade, brasileiro, enderecos, "Bibliotecario");
        this.setor = setor;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "matricula=" + getMatricula() +
                ", nome='" + exibirNomeCompleto() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
