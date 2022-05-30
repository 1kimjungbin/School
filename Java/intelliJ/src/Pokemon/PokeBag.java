package pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

    public final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;

        if(getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        return null;
    }

    public Pokemon getStrongest() {
        return null;
    }
}