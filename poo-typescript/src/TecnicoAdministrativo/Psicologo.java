package TecnicoAdministrativo;

import Endereco.Endereco;
import java.util.List;

public class Psicologo extends TecnicoAdministrativo {

    private String areaAtuacao = "";

    public Psicologo(String nome, String sobrenome, String sexo, String CPF, int idade,
                     boolean brasileiro, List<Endereco> enderecos, String areaAtuacao) {
        super(nome, sobrenome, sexo, CPF, idade, brasileiro, enderecos, "Psicologo");
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return this.areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Psicologo{" +
                "matricula=" + getMatricula() +
                ", nome='" + exibirNomeCompleto() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }
}
