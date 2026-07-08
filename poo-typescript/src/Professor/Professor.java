package Professor;

import Endereco.Endereco;
import Pessoa.Pessoa;
import Projeto.Projeto;
import java.util.List;
import java.util.Random;

public class Professor extends Pessoa implements Projeto {

    private double salario = 0.0;
    private String campusLotacao = "";

    public Professor(String nome, String sobrenome, String sexo, String CPF, int idade,
                     boolean brasileiro, List<Endereco> enderecos, double salario, String campusLotacao) {
        super(nome, sobrenome, sexo, CPF, idade, brasileiro, enderecos);
        this.matricula = this.gerarMatricula();
        this.salario = salario;
        this.campusLotacao = campusLotacao;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCampusLotacao() {
        return this.campusLotacao;
    }

    public void setCampusLotacao(String campusLotacao) {
        this.campusLotacao = campusLotacao;
    }

    @Override
    protected final int gerarMatricula() {
        Random random = new Random();
        return random.nextInt((99999999 - 10000000) + 1) + 10000000;
    }

    @Override
    public void submeterProjetoPesquisa() {
        System.out.println("Isso e uma submissao de projeto de pesquisa de professor.");
    }

    @Override
    public void submeterProjetoExtensao() {
        System.out.println("Isso e uma submissao de projeto de extensao de professor.");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + getMatricula() +
                ", nome='" + exibirNomeCompleto() + '\'' +
                ", salario=" + salario +
                ", campusLotacao='" + campusLotacao + '\'' +
                '}';
    }
}
