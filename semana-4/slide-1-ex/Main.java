public class Main {
    
    public static void main(String args[]){
        Endereco end = new Endereco("São joão", 828, "Jardim", "Campina", 8343000);

        Data dataNascimento = new Data(12, 6, 2000);

        Pessoa p1 = new  Pessoa("Hulk", "Programador", end, dataNascimento);

        p1.imprimir();
    }
}
