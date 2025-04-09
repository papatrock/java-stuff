public class IngressoVip extends Ingresso {
    private float valorAdicional;

    public IngressoVip(float valor, float valorAdicional){
        super(valor);
        this.setValor(this.getValor() + valorAdicional);
    }

}