package br.com.malbuquerque.domain;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String curso;
    private Double nota;
    private String sala;

    public Aluno(String nome, String curso, Double nota, String sala) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                ", sala=" + sala +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso) && Objects.equals(nota, aluno.nota) && Objects.equals(sala, aluno.sala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso, nota, sala);
    }
}
