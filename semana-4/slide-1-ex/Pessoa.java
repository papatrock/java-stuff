public class Pessoa {
    private String nome;
    private String ocupacao;
    private Endereco endereco;
    private Data dataNascimento;

    public Pessoa(String nome, String ocupacao, Endereco endereco, Data dataNascimento){
        this.nome = nome;
        this.ocupacao = ocupacao;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getOcupacao() {
        return ocupacao;
    }
    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Data getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Ocupação: " + ocupacao);
        System.out.println("Endereço: " + endereco.getNomeRua() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + ", " + endereco.getCep());
        System.out.println("Data de Nascimento: " + dataNascimento.getDia() + "/" + dataNascimento.getMes() + "/" + dataNascimento.getAno());
    }

}
//new Endereco("São João",828,"Jardim Pau", "Parana",838000);