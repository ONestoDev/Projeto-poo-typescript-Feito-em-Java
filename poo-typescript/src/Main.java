import java.util.List;

import Pessoa.Pessoa;
import Professor.Professor;
import Endereco.Endereco;
import Curso.CursoSubsequente;
import Curso.CursoIntegrado;
import Campus.Campus;
import TecnicoAdministrativo.Bibliotecario;
import TecnicoAdministrativo.Psicologo;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("12345-678", 100, "Rua A", "Bairro B", "Cidade C", "Estado D");
        Endereco endereco2 = new Endereco("98765-432", 200, "Avenida X", "Bairro Y", "Cidade Z", "Estado W");

        CursoSubsequente curso1 = new CursoSubsequente("Informática", 1200, true);
        CursoIntegrado curso2 = new CursoIntegrado("Eletrotécnica", 3200, true);
        CursoSubsequente curso3 = new CursoSubsequente("Redes de Computadores", 1400, false);

        // Instanciando o Campus com listas vazias usando List.of() e os cursos criados
        Campus campusAracaju = new Campus("Campus Aracaju", endereco1, List.of(), List.of(), List.of(curso1, curso2, curso3), List.of());

        // Criando as pessoas (Passando os endereços e cursos dentro de List.of())
        Professor luis = new Professor("Luis", "Gomes", "Masculino", "456.789.123-00", 45, false, List.of(endereco1), 5000, campusAracaju.getNome());

        Bibliotecario ana = new Bibliotecario("Ana", "Souza", "Feminino", "111.222.333-44", 38, true, List.of(endereco1), "Biblioteca");
        Psicologo carlos = new Psicologo("Carlos", "Lima", "Masculino", "222.333.444-55", 41, true, List.of(endereco2), "Atendimento estudantil");

        // Adicionando os membros ao campus
        campusAracaju.adicionarProfessor(luis);
        campusAracaju.adicionarTecnicoAdministrativo(ana);
        campusAracaju.adicionarTecnicoAdministrativo(carlos);

        // Exibindo os dados no console
        // Dica: Para o System.out.println mostrar os dados bonitinhos do objeto (e não a referência de memória),
        // certifique-se de que suas classes tenham o metodo 'toString()' sobrescrito.

        System.out.println(luis);
        System.out.println(campusAracaju);
        System.out.println(ana);
        System.out.println(carlos);
        System.out.println("----------------------------------");
        // Chamada do metodo estático da classe Pessoa
        System.out.println(Pessoa.getQuantidadePessoas());
    }
}
