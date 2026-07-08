package Curso;

public class CursoIntegrado extends Curso {

    private boolean nivelMedio = true;

    public CursoIntegrado(String nome, int cargaHoraria, boolean nivelMedio) {
        super(nome, cargaHoraria);
        this.nivelMedio = nivelMedio;
    }

    public boolean isNivelMedio() {
        return nivelMedio;
    }

    public void setNivelMedio(boolean nivelMedio) {
        this.nivelMedio = nivelMedio;
    }

    @Override
    public String toString() {
        return "CursoIntegrado{" +
                "nome='" + getNome() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", nivelMedio=" + nivelMedio +
                '}';
    }
}
