package lesson_3.Classes;

import lesson_3.Interfaces.Animal;

abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;

    public abstract String getBreed();
    public abstract String getName();
    public abstract String getCharacter();
    public abstract Double getCost();

    public abstract String setBreed(String breed);
    public abstract String setName(String name);
    public abstract String setCharacter(String character);
    public abstract Double setCost(Double cost);
}
