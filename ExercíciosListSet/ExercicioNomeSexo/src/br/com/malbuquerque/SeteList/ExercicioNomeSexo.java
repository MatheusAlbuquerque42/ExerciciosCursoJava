package br.com.malbuquerque.SeteList;

import java.util.*;

public class ExercicioNomeSexo {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Set<String> homens = new HashSet<>();
        Set<String> mulheres = new HashSet<>();

        System.out.println("Por favor, digite o nome de uma pessoa e o sexo dela separado por vírgula (ou digite 'sair' para encerrar):");

        while (true) {
            String resposta = s.nextLine();
            if (resposta.equalsIgnoreCase("sair")) {
                break;
            }

            String[] agrupamento = resposta.split(",");

            if (agrupamento.length >= 2) {
                String nome = agrupamento[0].trim();
                String sexo = agrupamento[1].trim().toLowerCase();

                if (sexo.equals("masculino")) {
                    homens.add(nome);
                } else if (sexo.equals("feminino")) {
                    mulheres.add(nome);
                }
            }
        }

        s.close();

        // Ordenar as listas por ordem alfabética
        List<String> homensOrdenados = new ArrayList<>(homens);
        Collections.sort(homensOrdenados);

        List<String> mulheresOrdenadas = new ArrayList<>(mulheres);
        Collections.sort(mulheresOrdenadas);

        System.out.println("Lista de homens:");
        for (String nome : homensOrdenados) {
            System.out.println(nome);
        }

        System.out.println("Lista de mulheres:");
        for (String nome : mulheresOrdenadas) {
            System.out.println(nome);
        }
    }
}
