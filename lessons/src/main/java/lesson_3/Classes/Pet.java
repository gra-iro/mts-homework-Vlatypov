package lesson_3.Classes;

public class Pet extends AbstractAnimal {

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String setBreed(String breed) {
        return breed;
    }

    @Override
    public String setCharacter(String character) {
        return character;
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public Double setCost(Double cost) {
        if (cost < 0){
            return null;
        }
        else {
            return cost;
        }
    }
}
