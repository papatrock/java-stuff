package br.com.alura.screematch.principal;

import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;

import br.com.alura.screematch.model.DadosEpisodio;
import br.com.alura.screematch.model.DadosSerie;
import br.com.alura.screematch.service.ConsumoApi;
import br.com.alura.screematch.service.ConverteDados;
import br.com.alura.screematch.model.DadosTemporada;
import br.com.alura.screematch.model.Episodio;

public class Principal {

  private Scanner leitura = new Scanner(System.in);
  private final String ENDERECO = "https://www.omdbapi.com/?t=";
  private final String API_KEY = "&apikey=6585022c";
  private ConsumoApi consumo = new ConsumoApi();
  private ConverteDados conversor = new ConverteDados();

  public void exibeMenu() {
    System.out.println("Digite o nome da serie");
    var nomeSerie = leitura.nextLine();

    var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

    DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

    System.out.println(dados);

    List<DadosTemporada> temporadas = new ArrayList<>();

    // System.out.printf("Total temporada: %d", dados.totalTemporadas());

    for (int i = 1; i <= dados.totalTemporadas(); ++i) {
      json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
      DadosTemporada dadosTemporada = conversor.obterDados(json,
          DadosTemporada.class);
      temporadas.add(dadosTemporada); // append na lista
    }

    // temporadas.forEach(System.out::println);

    // for (int i = 0; i < dados.totalTemporadas(); ++i) {
    // List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
    // for (int j = 0; j < episodiosTemporada.size(); ++j) {
    // System.out.println(episodiosTemporada.get(j).titulo());
    // }
    // }

    temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

    /*
     * Converte o Array para uma lista fixa com tamanho fixo.
     *
     */
    // List<String> nome = Arrays.asList("patrick", "k", "c", "e"); // fluxo de
    // dados

    // // fluxo de operações, cada operação gera um novo streaming

    // nome.stream().sorted().limit(4).filter(n -> n.startsWith("p")).map(n ->
    // n.toUpperCase())
    // .forEach(System.out::println);

    // List<DadosEpisodio> dadosEpisodios = temporadas.stream().flatMap(t ->
    // t.episodios().stream())
    // .collect(Collectors.toList()); // .toList() tbm funciona, gera uma lista
    // imutavel

    // dadosEpisodios.stream().filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
    // .peek(e -> System.out.println("Primeiro filtro NA" + e))
    // .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed()).limit(10).map(e
    // -> e.titulo().toUpperCase())
    // .forEach(System.out::println);

    List<Episodio> episodios = temporadas.stream()
        .flatMap(t -> t.episodios().stream().map(d -> new Episodio(t.numero(),
            d)))
        .collect(Collectors.toList());

    episodios.forEach(System.out::println);

    System.out.println("Trecho:");

    var trechoDoTitulo = leitura.nextLine();

    // Optionmal: objeto container que pode ou nao ser nulo
    Optional<Episodio> episodioBuscado = episodios.stream()
        .filter(e -> e.getTitulo().toUpperCase().contains(trechoDoTitulo.toUpperCase()))
        .findFirst();

    if (episodioBuscado.isPresent())
      System.out.println("ep econtrado, temporada:" + episodioBuscado.get().getTemporada());

    DoubleSummaryStatistics est = episodios.stream().filter(e -> e.getAvaliacao() > 0.0)
        .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));

    System.out.println("Média:" + est.getAverage() + "\nMelhor: " + est.getMax() + "\nPior " + est.getMin());
    // System.out.println("ano");

    // var ano = leitura.nextInt();
    // leitura.nextLine(); // consome \n

    // LocalDate dataBusca = LocalDate.of(ano, 1, 1);

    // DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // episodios.stream().filter(e -> e.getDataLancamento() != null &&
    // e.getDataLancamento().isAfter(dataBusca))
    // .forEach(e -> System.out.println("Temporada: " + e.getTemporada() + "
    // Episodio:" + e.getTitulo()
    // + "Data lancamento: " + e.getDataLancamento().format(formatador)));

  }

  // https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c
}
