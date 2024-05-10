public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder = 0;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        cozinheiro.prepararPrato(index); //cozinheiro preparando o prato
        cozinheiro.comparaReceita();
    }
    public Pirata lutar(Pirata pirata) {
        int poder1 = pirata.poder;
        int poder2 = this.poder;
        if (poder1 > poder2) {
            return pirata;
        }
    }

}

