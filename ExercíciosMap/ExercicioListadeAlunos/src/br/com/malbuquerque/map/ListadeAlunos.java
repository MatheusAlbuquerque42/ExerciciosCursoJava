/**
 * Classe ListadeAlunos
 *
 * Essa classe representa um exemplo de uso de um Map para armazenar listas de alunos separadas por sala.
 * Cada sala é identificada por um número de sala (índice) e contém uma lista de objetos Aluno.
 *
 * Os objetivos do código são:
 * - Criar duas salas com quantidades diferentes de alunos.
 * - Imprimir as duas salas na tela apenas com o nome do aluno e a sala que ele pertence.
 */
package br.com.malbuquerque.map;

import br.com.malbuquerque.domain.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListadeAlunos {
    public static void main(String args[]) {
        // Criação do Map para armazenar as listas de alunos separadas por sala
        Map<Integer, List<Aluno>> listadeSala = new HashMap<>();

        // Definição dos números de sala
        Integer sala1 = 1;
        Integer sala2 = 2;

        // Criação da lista de alunos da Sala 1
        List<Aluno> alunosSala1 = criarsala("Sala 1", 10);

        // Verificação do número mínimo de alunos da Sala 1
        if (alunosSala1.size() >= 1) {
            listadeSala.put(sala1, alunosSala1);
        } else {
            System.out.println("A sala 1 não possui alunos suficientes.");
        }

        // Criação da lista de alunos da Sala 2
        List<Aluno> alunosSala2 = criarsala("Sala 2", 30);

        // Verificação do número mínimo de alunos da Sala 2
        if (alunosSala2.size() >= 1) {
            listadeSala.put(sala2, alunosSala2);
        } else {
            System.out.println("A sala 2 não possui alunos suficientes.");
        }

        // Impressão da lista da Sala 1
        System.out.println("Lista da Sala 1: ");
        ImprimirLista(listadeSala.get(sala1));
        System.out.println();

        // Impressão da lista da Sala 2
        System.out.println("Lista da Sala 2: ");
        ImprimirLista(listadeSala.get(sala2));
        System.out.println();
    }

    /**
     * Imprime a lista de alunos na tela, exibindo o nome do aluno e a sala que ele pertence.
     *
     * @param alunos lista de alunos
     */
    private static void ImprimirLista(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
    }

    /**
     * Cria uma lista de alunos para uma sala específica com base no nome da sala e na quantidade de alunos.
     *
     * @param sala    nome da sala
     * @param tamanho quantidade de alunos
     * @return lista de alunos
     */
    private static List<Aluno> criarsala(String sala, int tamanho) {
        List<Aluno> alunos = new ArrayList<>();
        for (int j = 0; j < tamanho; j++) {
            Aluno aluno = new Aluno("Aluno " + j, " Curso " + j, (double) j, sala);
            alunos.add(aluno);
        }
        return alunos;
    }
}
