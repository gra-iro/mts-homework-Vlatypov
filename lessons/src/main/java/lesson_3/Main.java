package lesson_3;

import lesson_3.Classes.CreateAnimalServiceImpl;
import lesson_3.Interfaces.CreateAnimalService;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService animalService = new CreateAnimalService(){};
        // вызов дефолтного метода с интерфейса CreateAnimalService с конструкцией While
        animalService.createAnimal();

        CreateAnimalServiceImpl animalServiceImp = new CreateAnimalServiceImpl(){};
        // Вызов перегруженного метода, использующего конструкцию For
        animalServiceImp.createAnimal(12);

        // Вызов переопределенного метода, использующего конструкцию Do-While
        animalServiceImp.createAnimal();
    }
}
