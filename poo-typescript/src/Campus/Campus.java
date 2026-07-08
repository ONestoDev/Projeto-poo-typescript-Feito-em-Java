package Campus;

import Aluno.Aluno;
import Curso.Curso;
import Endereco.Endereco;
import Professor.Professor;
import TecnicoAdministrativo.TecnicoAdministrativo;
import java.util.ArrayList;
import java.util.List;

public class Campus {

    private String nome = "";
    private Endereco endereco;
    private int quantidadeAlunos = 0;

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursosOfertados = new ArrayList<>();
    private List<TecnicoAdministrativo> tecnicosAdministrativos = new ArrayList<>();

    public Campus(String nome, Endereco endereco, List<Aluno> alunos, List<Professor> professores,
                  List<Curso> cursosOfertados, List<TecnicoAdministrativo> tecnicosAdministrativos) {
        this.nome = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>(alunos);
        this.professores = new ArrayList<>(professores);
        this.cursosOfertados = new ArrayList<>(cursosOfertados);
        this.tecnicosAdministrativos = new ArrayList<>(tecnicosAdministrativos);
        this.atualizarQuantidadeAlunos();
    }

    public Campus(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.atualizarQuantidadeAlunos();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeAlunos() {
        return this.quantidadeAlunos;
    }

    private void atualizarQuantidadeAlunos() {
        this.quantidadeAlunos = this.alunos.size();
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = new ArrayList<>(alunos);
        this.atualizarQuantidadeAlunos();
    }

    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = new ArrayList<>(professores);
    }

    public List<Curso> getCursosOfertados() {
        return this.cursosOfertados;
    }

    public void setCursosOfertados(List<Curso> cursosOfertados) {
        this.cursosOfertados = new ArrayList<>(cursosOfertados);
    }

    public List<TecnicoAdministrativo> getTecnicosAdministrativos() {
        return this.tecnicosAdministrativos;
    }

    public void setTecnicosAdministrativos(List<TecnicoAdministrativo> tecnicosAdministrativos) {
        this.tecnicosAdministrativos = new ArrayList<>(tecnicosAdministrativos);
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        this.atualizarQuantidadeAlunos();
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        this.cursosOfertados.add(curso);
    }

    public void adicionarTecnicoAdministrativo(TecnicoAdministrativo tecnico) {
        this.tecnicosAdministrativos.add(tecnico);
    }

    @Override
    public String toString() {
        return "Campus{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", quantidadeAlunos=" + quantidadeAlunos +
                ", professores=" + professores +
                ", cursosOfertados=" + cursosOfertados +
                ", tecnicosAdministrativos=" + tecnicosAdministrativos +
                '}';
    }
}
