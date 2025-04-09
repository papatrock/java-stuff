public class IngressoCamarote extends IngressoVip {
    private float adicionalCamarote;

    public IngressoCamarote(float valor, float valorAdicional, float adicionalCamarote){
        super(valor, valorAdicional);

        this.setValor(this.getValor() + adicionalCamarote);
    }

    
    
}