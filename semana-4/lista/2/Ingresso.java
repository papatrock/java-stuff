public class Ingresso {
    private float valor;

    public Ingresso(float valor){
        this.setValor(valor);
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return this.valor;
    }

    public void imprimirValor(){
        System.out.printf("Valor: %.2f\n", this.getValor());
    }
}

