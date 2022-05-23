package Pokemon;

public class PokemonInfo {
    private String Name;
    private int Cp;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getCp() {
        return Cp;
    }

    public void setCp(int cp) {
        this.Cp = cp;
    }

    public PokemonInfo (String Name, int Cp) {
        this.Name = Name;
        this.Cp = Cp;
    }
}
