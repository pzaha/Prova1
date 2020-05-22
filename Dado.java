import java.util.Random;

public class Dado {
    private int risultato;


    public int getRisultato(){
        return this.risultato;
    }

    public void setRisultato(int risultato){
        this.risultato=risultato;
    }

    public int lanciaDado(){
        Random r= new Random();
        int result= r.nextInt(6)+1;
        return result;
    }
}


