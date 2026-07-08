package Pessoa;

import Endereco.Endereco;
import java.util.ArrayList;
import java.util.List;

abstract public class Pessoa {

    // Atributos de Instância

    protected int matricula = 0;
    private String nome = "";
    private String sobrenome = "";
    private String sexo = "";
    private String CPF = "";
    private int idade = 0;
    private boolean brasileiro = true;
    private List<Endereco> enderecos = new ArrayList<>();

    // Atributos Estáticos
    private static int quantidadePessoas = 0;

    // Construtor

    public Pessoa(String nome, String sobrenome, String sexo, String cpf, int idade, boolean brasileiro, List<Endereco> enderecos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.CPF = cpf;
        this.idade = idade;
        this.brasileiro = brasileiro;
        this.enderecos = new ArrayList<>(enderecos);
        Pessoa.quantidadePessoas++;
    }


    // Getters e Setters
    public int getMatricula() {
        return this.matricula;
    }

    protected void setMatricula(int valor) {
        this.matricula = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(boolean brasileiro) {
        this.brasileiro = brasileiro;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = new ArrayList<>(enderecos);
    }

    // Métodos de Instância

    public String exibirNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public Endereco recuperarEndereco(int posicao) {
        if (posicao >= 0 && posicao < this.enderecos.size()) {
            return this.enderecos.get(posicao);
        }
        return null; // Retorna null se a posição for inválida}
    }

    // Métodos Estáticos

    public static int getQuantidadePessoas() {
        return Pessoa.quantidadePessoas;
    }

    // Métodos Abstratos

    protected abstract int gerarMatricula();

    @Override
    public String toString() {
        return "Pessoa{" +
                "matricula=" + matricula +
                ", nome='" + exibirNomeCompleto() + '\'' +
                ", sexo='" + sexo + '\'' +
                ", CPF='" + CPF + '\'' +
                ", idade=" + idade +
                ", brasileiro=" + brasileiro +
                ", enderecos=" + enderecos +
                '}';
    }
}
