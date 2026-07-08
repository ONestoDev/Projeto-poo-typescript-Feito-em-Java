package Curso;

public class CursoSubsequente extends Curso {
    private boolean estagioObrigatorio = false;

    // Construtor
    public CursoSubsequente(String nome, int cargaHoraria, boolean estagioObrigatorio) {
        super(nome, cargaHoraria);
        this.estagioObrigatorio = estagioObrigatorio;
    }

    public boolean isEstagioObrigatorio() {
        return estagioObrigatorio;
    }

    public void setEstagioObrigatorio(boolean estagioObrigatorio) {
        this.estagioObrigatorio = estagioObrigatorio;
    }

    @Override
    public String toString() {
        return "CursoSubsequente{" +
                "nome='" + getNome() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", estagioObrigatorio=" + estagioObrigatorio +
                '}';
    }
}
