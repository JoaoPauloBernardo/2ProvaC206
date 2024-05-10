import java.util.ArrayList;
import java.util.Objects;

public class Cozinheiro extends Pirata{
    ArrayList<String> livroDeReceitas;

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public ArrayList<String> getLivroDeReceitas() {
        return livroDeReceitas;
    }
    public String prepararPrato(int index){
        return livroDeReceitas.get(index);
    }
    public void mostrarReceitas(){
        for (int index = 0; index < livroDeReceitas.size(); index++) {
            getLivroDeReceitas();
        }
        //eu nao me lembro como fazer o try catch, eu sei que tem que ter
        //mas eu nao me lembro a sintaxe entao prefiro nao buggar meu codigo atoa
    }
    public void comparaReceita(){
        String comidaFavorita = super.getComidaFavorita();
        int poder = super.getPoder();
        for (int index = 0; index < livroDeReceitas.size(); index++) {
            if(Objects.equals(livroDeReceitas.get(index), comidaFavorita)){
                poder = poder*2;
            }
            else{
                poder += poder;
            }
        }
    }
}
