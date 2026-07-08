package Aluno;

import Curso.CursoSubsequente;
import Endereco.Endereco;
import Pessoa.Pessoa;
import Projeto.Projeto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Aluno extends Pessoa implements Projeto {

    private List<CursoSubsequente> cursos = new ArrayList<>();
    private String situacao = "Matriculado";

    public Aluno(String nome, String sobrenome, String sexo, String CPF, int idade,
                 boolean brasileiro, List<Endereco> enderecos, List<CursoSubsequente> cursos) {
        super(nome, sobrenome, sexo, CPF, idade, brasileiro, enderecos);
        this.matricula = this.gerarMatricula();
        this.cursos = new ArrayList<>(cursos);
    }

    public List<CursoSubsequente> getCurso() {
        return this.cursos;
    }

    public void setCurso(List<CursoSubsequente> valor) {
        this.cursos = new ArrayList<>(valor);
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String valor) {
        this.situacao = valor;
    }

    @Override
    protected final int gerarMatricula() {
        int ano = LocalDate.now().getYear();
        int numero = ThreadLocalRandom.current().nextInt(1000, 9999 + 1);
        return Integer.parseInt(String.format("%d%04d", ano, numero));
    }

    @Override
    public void submeterProjetoPesquisa() {
        System.out.println("Isso e um projeto de pesquisa submetido por um aluno.");
    }

    @Override
    public void submeterProjetoExtensao() {
        System.out.println("Isso e um projeto de extensao submetido por um aluno.");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + getMatricula() +
                ", nome='" + exibirNomeCompleto() + '\'' +
                ", cursos=" + cursos +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
