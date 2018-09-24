package proj1fa18;

public class Bear extends Animal {
    private int       strength;
    private String    gender;
    private String    species;
    private int       predator;

    public Bear() {
        strength = super.getStrength();
        gender = super.getGender();
        species = super.getSpecies();
        predator = 1;
    }
}
