package lesson_3;

import lesson_3.Classes.CreateAnimalServiceImpl;
import lesson_3.Interfaces.CreateAnimalService;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalService(){};
        animalService.createAnimal();

        CreateAnimalServiceImpl animalServiceImp = new CreateAnimalServiceImpl(){};
        animalServiceImp.createAnimal(12);
        animalServiceImp.createAnimal();
    }
}
