package br.com.alura.screematch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screematch.principal.Principal;
//import br.com.alura.screematch.service.IMult;

@SpringBootApplication
public class ScreematchApplication implements CommandLineRunner { // must implements run

  public static void main(String[] args) { // Ponto de entrada da aplicação
    SpringApplication.run(ScreematchApplication.class, args);
  }

  public void run(String... args) throws Exception {

    // Principal principal = new Principal();

    // principal.exibeMenu();
    // IMult mult = (a, b) -> a * b;

    // System.out.println(mult.multiplicacao(5, 3));

    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
    // numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    // List<String> palavras = Arrays.asList("java", "stream", "lambda");

    // palavras.stream().map(p -> p.toUpperCase()).forEach(System.out::println);

    // List<Integer> dobroImpares = numeros.stream().filter(n -> n % 2 != 0).map(n
    // -> n * 2).collect(Collectors.toList());

    // for (Integer num : dobroImpares)
    // System.out.println(num);

    // List<String> palavras2 = Arrays.asList("apple", "banana", "apple", "orange",
    // "banana");

    // palavras2.stream().distinct().forEach(System.out::println);

    // List<List<Integer>> listaDeNumeros = Arrays.asList(
    // Arrays.asList(1, 2, 3, 4),
    // Arrays.asList(5, 6, 7, 8),
    // Arrays.asList(9, 10, 11, 12));

    // // código para filtrar e ordenar números primos

    // listaDeNumeros.stream()
    // .forEach(l ->
    // l.stream().filter(ScreematchApplication::ehPrimo).sorted().forEach(System.out::println));

    // List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

    // numeros.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

    // Optional<Integer> max = numeros.stream().max(Integer::compare); // import
    // Optional

    // max.ifPresent(System.out::println);

    List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

    Map<Integer, List<String>> agrupamento = palavras.stream().collect(Collectors.groupingBy(String::length)); // import
                                                                                                               // Map
    System.out.println(agrupamento);

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
    int somaDosQuadrados = numeros.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * n)
        .reduce(0, Integer::sum);
    System.out.println(somaDosQuadrados);
  }

  private static boolean ehPrimo(int numero) {
    if (numero < 2)
      return false;
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }
}
