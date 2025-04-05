
import java.util.Date;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private Date nascimento;


    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public Date getNascimento(){
        return this.nascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNascimento(Date nascimento){
        this.nascimento = nascimento;
    }


    public void ajustarDAtaDeNascimento(int dia, int mes, int ano){
        Calendar calendario = Calendar.getInstance();
        
        calendario.set(ano, mes-1, dia);
        this.nascimento = calendario.getTime();

    }

    
    public void calcularIdade(){
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(this.nascimento);
        Calendar hoje = Calendar.getInstance();
        
        this.idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
    }
}
