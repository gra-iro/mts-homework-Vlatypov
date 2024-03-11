package lesson_3.Classes;

import lesson_3.Interfaces.Animal;

abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;

    public String getBreed() {
        return breed;
    }

    public String getCharacter() {
        return character;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public String setBreed(String breed) {
        return breed;
    }

    public String setCharacter(String character) {
        return character;
    }

    public String setName(String name) {
        return name;
    }

    public Double setCost(Double cost) {
        if (cost < 0){
            return null;
        }
        else {
            return cost;
        }
    }
}
