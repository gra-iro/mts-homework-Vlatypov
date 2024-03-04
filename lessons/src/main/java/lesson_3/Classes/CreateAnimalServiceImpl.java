package lesson_3.Classes;

import lesson_3.Interfaces.CreateAnimalService;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    @Override
    public void createAnimal(int N) {

        for (int i = 0; i < N; i++){
            if (i <= 2) {
                Cat cat = new Cat();
                System.out.println("Create cat " + (i+1));
            }
            if (i > 2 && i <= 5){
                Dog dog = new Dog();
                System.out.println("Create dog " + (i+1));
            }
            if (i > 5 && i < 8){
                Shark shark = new Shark();
                System.out.println("Create shark " + (i+1));
            }
            if (i >= 8){
                Wolf wold = new Wolf();
                System.out.println("Create wolf " + (i+1));
            }
        }
    }

    @Override
    public void createAnimal() {
        int counter = 0;

        do {
            if (counter <= 2) {
                Cat cat = new Cat();
                System.out.println("Create cat " + (counter+1));
            }
            if (counter > 2 && counter <= 5){
                Dog dog = new Dog();
                System.out.println("Create dog " + (counter+1));
            }
            if (counter > 5 && counter < 8){
                Shark shark = new Shark();
                System.out.println("Create shark " + (counter+1));
            }
            if (counter >= 8 && counter < 10){
                Wolf wold = new Wolf();
                System.out.println("Create wolf " + (counter+1));
            }
            counter++;
        } while (counter < 10);
    }
}
