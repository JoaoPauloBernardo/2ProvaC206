import java.util.Objects;

public class Capitao extends Pirata implements Comandar {
    private int numeroDeSeguidores = 0;

    public Capitao(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public void conquistarNovoSeguidor(Pirata pirata){
        int poder1 = pirata.getPoder();
        int poder2 = super.getPoder();
        if(poder1 > poder2){
            this.numeroDeSeguidores++;
        }
        else{
            //nao faz nada por que o pirata nao entrou no grupo
        }
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota");
    }
}
