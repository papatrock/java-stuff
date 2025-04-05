
public class Eletronico {
    public static class Computador{
        private String modelo;
        private int ano;

        public Computador(String modelo, int ano){
            this.modelo = modelo;
            this.ano = ano;
        }

        public String getModelo(){
            return this.modelo;
        }

        public int getAno(){
            return this.ano;
        }

    }

    public static void main(String args[]){

        Computador computa = new Computador("Lenovo", 2010);
        System.out.printf("%s %d\n", computa.getModelo(), computa.getAno());

    }
}
