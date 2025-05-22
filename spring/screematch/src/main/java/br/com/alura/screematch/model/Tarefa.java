package br.com.alura.screematch.model;

public class Tarefa {
  private String descricao;
  private boolean concluida;
  private String pessoaResponsavel;

  public Tarefa() { // Construto deafult (necessario para o Jackson)

  }

  public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
    this.descricao = descricao;
    this.concluida = concluida;
    this.pessoaResponsavel = pessoaResponsavel;

  }

  public String getDescricao() {
    return this.descricao;
  }

  public boolean getConcluida() {
    return this.concluida;
  }

  public String getPessoaReponsavel() {
    return this.pessoaResponsavel;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setConcluida(boolean concluida) {
    this.concluida = concluida;
  }

  public void setPessoaReponsavel(String pessoaResponsavel) {
    this.pessoaResponsavel = pessoaResponsavel;
  }

  @Override
  public String toString() {
    String stringConcat = this.descricao + "-" + this.pessoaResponsavel + "-";

    if (this.concluida) {
      stringConcat += "concluida";
      return stringConcat;
    }

    stringConcat += "não concluida";

    return stringConcat;
  }

}
