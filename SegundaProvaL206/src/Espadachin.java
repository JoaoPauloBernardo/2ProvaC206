public class Espadachin extends Pirata implements Comandar{
    private String nomeDaEspada;

    public Espadachin(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    @Override
    public void darOrdens() {
        System.out.println("O imediato está ordenando os tripulantes");
    }
    @Override
    public void mudarRota(){
        System.out.println("O imediato está mudando a rota");
    }
}

