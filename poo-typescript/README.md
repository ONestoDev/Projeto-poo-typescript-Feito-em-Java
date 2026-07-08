# Programacao Orientada a Objetos com Java

Projeto desenvolvido para praticar os principais conceitos da Programacao Orientada a Objetos (POO) utilizando Java.

Este repositorio e uma releitura em Java do projeto original feito em TypeScript:

https://github.com/ONestoDev/poo-typescript/blob/index/README.md

A ideia foi manter a mesma proposta de estudo e o mesmo dominio escolar, mas reimplementar a modelagem usando recursos proprios da linguagem Java, como classes abstratas, interfaces, pacotes, heranca e compilacao com JDK.

---

## Sobre o projeto

O projeto representa um pequeno sistema academico em memoria, com entidades como:

- Pessoa
- Aluno
- Professor
- TecnicoAdministrativo
- Bibliotecario
- Psicologo
- Campus
- Curso
- Endereco
- Projeto

O objetivo principal nao e criar um sistema completo de gestao escolar, mas praticar modelagem orientada a objetos e entender como os relacionamentos entre classes mudam quando o mesmo problema e implementado em outra linguagem.

---

## Comparacao com a versao TypeScript

| Aspecto | Versao TypeScript | Versao Java |
| --- | --- | --- |
| Linguagem | TypeScript | Java |
| Execucao | Node.js e npm | JDK, javac e java |
| Organizacao | Modulos TypeScript | Pacotes Java |
| Tipagem | Estatica sobre JavaScript | Estatica nativa |
| Classe base | Classes com heranca | Classes abstratas com heranca |
| Contratos | Interfaces TypeScript | Interfaces Java |
| Saida compilada | JavaScript | Bytecode `.class` |
| Entrada do programa | Script executado via npm | Classe `Main` |

Apesar das diferencas de sintaxe e ferramentas, os dois projetos trabalham a mesma base conceitual: representar objetos, organizar responsabilidades e aplicar os pilares da POO.

---

## Conceitos abordados

- Classes e objetos
- Encapsulamento
- Construtores
- Heranca
- Polimorfismo
- Abstracao
- Interfaces
- Associacao
- Agregacao
- Composicao
- Modificadores de acesso
- Organizacao de codigo em pacotes Java

---

## Tecnologias utilizadas

- Java
- JDK 21
- IntelliJ IDEA

O projeto nao depende de bibliotecas externas.

---

## Estrutura do projeto

```text
.
|-- src/
|   |-- Main.java
|   |-- Aluno/
|   |   `-- Aluno.java
|   |-- Campus/
|   |   `-- Campus.java
|   |-- Curso/
|   |   |-- Curso.java
|   |   |-- CursoIntegrado.java
|   |   `-- CursoSubsequente.java
|   |-- Endereco/
|   |   `-- Endereco.java
|   |-- Pessoa/
|   |   `-- Pessoa.java
|   |-- Professor/
|   |   `-- Professor.java
|   |-- Projeto/
|   |   `-- Projeto.java
|   `-- TecnicoAdministrativo/
|       |-- TecnicoAdministrativo.java
|       |-- Bibliotecario.java
|       `-- Psicologo.java
|-- out/
`-- README.md
```

---

## Como executar o projeto

### Compile os arquivos Java

Na raiz do projeto:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object { $_.FullName })
```

Caso o `javac` nao esteja no PATH, use o caminho completo do JDK instalado. Exemplo:

```powershell
& 'C:\Users\ONestoGamer\.jdks\ms-21.0.11\bin\javac.exe' -d out (Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object { $_.FullName })
```

### Execute a classe principal

```powershell
java -cp out Main
```

Ou, usando o caminho completo do JDK:

```powershell
& 'C:\Users\ONestoGamer\.jdks\ms-21.0.11\bin\java.exe' -cp out Main
```

---

## Exemplo de saida

```text
Professor{matricula=89409093, nome='Luis Gomes', salario=5000.0, campusLotacao='Campus Aracaju'}
Campus{nome='Campus Aracaju', ...}
Bibliotecario{matricula=7719, nome='Ana Souza', cargo='Bibliotecario', setor='Biblioteca'}
Psicologo{matricula=3846, nome='Carlos Lima', cargo='Psicologo', areaAtuacao='Atendimento estudantil'}
----------------------------------
3
```

Os numeros de matricula podem mudar a cada execucao, pois sao gerados automaticamente.

---

## Objetivos de aprendizado

Este projeto foi feito para fortalecer conhecimentos em:

- Programacao Orientada a Objetos em Java
- Comparacao entre implementacoes em TypeScript e Java
- Uso de classes abstratas
- Uso de interfaces
- Heranca entre classes
- Modelagem de entidades de dominio
- Organizacao de pacotes
- Compilacao e execucao com JDK

---

## Principais diferencas percebidas

Na versao TypeScript, a execucao depende do ecossistema Node.js e da configuracao do `package.json` e `tsconfig.json`.

Na versao Java, o foco muda para a estrutura de pacotes, compilacao com `javac`, geracao de arquivos `.class` e execucao pela JVM.

Outro ponto importante e que Java exige maior rigor nas assinaturas de construtores, nos tipos das listas e na relacao entre classes abstratas e subclasses. Isso ajuda a treinar melhor a consistencia da modelagem.

---

## Roadmap

- [x] Recriar o dominio do projeto TypeScript em Java
- [x] Implementar classes principais
- [x] Implementar heranca com `Pessoa`
- [x] Implementar interface `Projeto`
- [x] Implementar classe abstrata `TecnicoAdministrativo`
- [x] Compilar e executar a classe `Main`
- [ ] Adicionar exemplos com `Aluno`
- [ ] Criar testes automatizados
- [ ] Normalizar nomes de pacotes para o padrao Java em letras minusculas
- [ ] Adicionar mais regras de negocio

---

## Autor

Desenvolvido por ONestoDev como exercicio de estudo em POO, comparando uma implementacao em TypeScript com uma implementacao em Java.

---

## Licenca

Este projeto segue a mesma proposta de licenca do projeto original, licenciado sob MIT.
