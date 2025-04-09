public class Lampada {
    
    private boolean estado;

    public Lampada(boolean estado){
        this.estado = estado;
    }

    public void ligar(){
        this.estado = true;
    }

    public void desligar(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }


    public void printEstado(){
        if(this.estado){
            System.out.printf("Lampada ligada!\n");
        }
        else{
            System.out.printf("Lampada desligada!\n");
        }
    }

}
