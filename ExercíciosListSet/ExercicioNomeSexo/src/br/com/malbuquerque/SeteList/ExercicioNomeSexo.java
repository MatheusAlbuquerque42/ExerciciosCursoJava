package br.com.malbuquerque.SeteList;

/**
 * ExercicioNomeSexo é um programa que lê nomes e sexos de pessoas a partir do console
 * e armazena as informações em conjuntos separados por sexo. Em seguida, imprime as
 * listas de homens e mulheres em ordem alfabética.
 */


import java.util.*;

public class ExercicioNomeSexo {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Conjuntos para armazenar os nomes de homens e mulheres
        Set<String> homens = new HashSet<>();
        Set<String> mulheres = new HashSet<>();

        System.out.println("Por favor, digite o nome de uma pessoa e o sexo dela separado por vírgula (ou digite 'sair' para encerrar):");

        while (true) {
            String resposta = s.nextLine();

            // Verifica se o usuário deseja encerrar o programa
            if (resposta.equalsIgnoreCase("sair")) {
                break;
            }

            // Separa a resposta em nome e sexo
            String[] agrupamento = resposta.split(",");

            // Verifica se o agrupamento contém nome e sexo
            if (agrupamento.length >= 2) {
                String nome = agrupamento[0].trim();
                String sexo = agrupamento[1].trim().toLowerCase();

                // Adiciona o nome ao conjunto correspondente com base no sexo
                if (sexo.equals("masculino")) {
                    homens.add(nome);
                } else if (sexo.equals("feminino")) {
                    mulheres.add(nome);
                }
            }
        }

        s.close();

        // Ordena as listas de homens e mulheres em ordem alfabética
        List<String> homensOrdenados = new ArrayList<>(homens);
        Collections.sort(homensOrdenados);

        List<String> mulheresOrdenadas = new ArrayList<>(mulheres);
        Collections.sort(mulheresOrdenadas);

        // Imprime a lista de homens
        System.out.println("Lista de homens:");
        for (String nome : homensOrdenados) {
            System.out.println(nome);
        }

        // Imprime a lista de mulheres
        System.out.println("Lista de mulheres:");
        for (String nome : mulheresOrdenadas) {
            System.out.println(nome);
        }
    }
}
