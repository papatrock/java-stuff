public class Main {
    
    public static void main(String args[]) {
        Pessoa pessoas[] = new Pessoa[2];

        pessoas[0] = new Pessoa();
        pessoas[0].setNome("Grace Copper");
        pessoas[0].ajustarDAtaDeNascimento(9, 11,1906);
        pessoas[0].calcularIdade();
        
        pessoas[1] = new Pessoa();
        pessoas[1].setNome("Ada Lovelace");
        pessoas[1].ajustarDAtaDeNascimento(10,11, 1815);
        pessoas[1].calcularIdade();

        System.out.printf("%s:\n  Data de nascimento:%s\n  idade:%d\n",pessoas[0].getNome(), pessoas[0].getNascimento(), pessoas[0].getIdade());

        System.out.printf("%s:\n  Data de nascimento:%s\n  idade:%d\n",pessoas[1].getNome(), pessoas[1].getNascimento(), pessoas[1].getIdade());
        
    }
}
