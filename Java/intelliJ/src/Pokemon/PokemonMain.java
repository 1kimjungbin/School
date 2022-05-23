package Pokemon;

public class PokemonMain {
    public static void main(String[] args) {
        PokemonInfo p1 = new PokemonInfo("마릴", 816);
        PokemonInfo p2 = new PokemonInfo("라프라스", 1822);

        System.out.println(p1.getName() + "(" + p1.getCp() + ")");
        System.out.println(p2.getName() + "(" + p2.getCp() + ")");
    }
}
