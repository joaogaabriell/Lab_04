# Lab 04 — Produção de Filme (Composição e Polimorfismo)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Modelagem de uma produção de cinema priorizando **composição em vez de herança**: uma `Pessoa` não *é* um ator ou diretor — ela *possui* uma lista de funções (`Funcao`), podendo acumular vários papéis ao mesmo tempo (ex.: ator e roteirista no mesmo filme).

| Classe | Descrição |
|---|---|
| `Funcao` | Interface que representa um papel na produção |
| `Ator`, `Diretor`, `Roteirista`, `Cinegrafista` | Implementações concretas de `Funcao` |
| `Pessoa` | Tem nome, lista de funções e filmografia |
| `Filme` | Título, ano, diretor, roteirista, trilha sonora e elenco |
| `CriandoOFilme` | Classe principal que monta um filme completo e exibe os detalhes |

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="Laboratorio_04.CriandoOFilme"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `CriandoOFilme`.

## Testes

```bash
mvn test
```
