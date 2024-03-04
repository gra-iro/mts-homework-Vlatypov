package lesson_3.Interfaces;

import lesson_3.Classes.Cat;
import lesson_3.Classes.Dog;
import lesson_3.Classes.Shark;
import lesson_3.Classes.Wolf;

public interface CreateAnimalService {
    public default void createAnimal(){
        int counter = 0;

        while (counter < 10){
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
        }
    }

    public default void createAnimal(int N){};
}
