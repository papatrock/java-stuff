package br.com.alura.screematch.model;

import java.util.List;

public class Avaliacao<T> {
  private T itemAvaliado;
  private double nota;
  private String comentario;

  public Avaliacao() { // Construtor default (necessario para o Jackson)
  }

  public Avaliacao(T itemAvaliado, double nota, String comentario) {

    if (nota < 0 || nota > 10)
      throw new IllegalArgumentException("Nota deve estar entre 0 e 10");

    this.itemAvaliado = itemAvaliado;
    this.nota = nota;
    this.comentario = comentario;
  }

  public T getItemAvaliado() {
    return this.itemAvaliado;
  }

  public double getNota() {
    return this.nota;
  }

  public String getComentario() {
    return this.comentario;
  }

  public void setItemAvaliado(T itemAvaliado) {
    this.itemAvaliado = itemAvaliado;
  }

  public void setNotas(double nota) {
    this.nota = nota;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public static <T> double obterNotaMedia(List<Avaliacao<T>> avaliacoes) {
    if (avaliacoes.isEmpty())
      throw new IllegalArgumentException("Lista vazia");

    double soma = 0;

    for (Avaliacao<T> avaliacao : avaliacoes)
      soma += avaliacao.getNota();

    return soma / avaliacoes.size();
  }
}
