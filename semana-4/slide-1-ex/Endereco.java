public class Endereco {
    private String nomeRua;
    private int numero;
    private String bairro;
    private String cidade;
    private int cep;

    public Endereco(String nomeRua, int numero, String bairro, String cidade, int cep){
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getNomeRua() {
        return nomeRua;
    }
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }


}
