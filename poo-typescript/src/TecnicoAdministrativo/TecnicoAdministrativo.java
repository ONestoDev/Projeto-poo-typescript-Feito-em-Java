package TecnicoAdministrativo;

import Endereco.Endereco;
import Pessoa.Pessoa;
import java.util.List;
import java.util.Random;

public abstract class TecnicoAdministrativo extends Pessoa {

    private String cargo = "";

    public TecnicoAdministrativo(String nome, String sobrenome, String sexo, String CPF, int idade,
                                 boolean brasileiro, List<Endereco> enderecos, String cargo) {
        super(nome, sobrenome, sexo, CPF, idade, brasileiro, enderecos);
        this.matricula = this.gerarMatricula();
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    protected final int gerarMatricula() {
        Random random = new Random();
        return random.nextInt(9000) + 1000;
    }

    @Override
    public String toString() {
        return "TecnicoAdministrativo{" +
                "matricula=" + getMatricula() +
                ", nome='" + exibirNomeCompleto() + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
