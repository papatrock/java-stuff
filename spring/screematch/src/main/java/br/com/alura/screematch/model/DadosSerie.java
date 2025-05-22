package br.com.alura.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
// import com.fasterxml.jackson.annotation.JsonProperty; //(para usar property)
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo, // funciona com range (ex: @JsonAlias("Title", "Titulo"))
    @JsonAlias("totalSeasons") Integer totalTemporadas,
    @JsonAlias("imdbRating") String avaliacao) { // outra forma: @JsonProperty("imdbVotes") String votos

}
