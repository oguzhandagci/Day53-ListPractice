package Mains;

import Classes.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal1=new Animal("Gessi",true,2);
        Animal animal2=new Animal("Mochi");

        Scanner scanner = new Scanner(System.in);
        String nameOfAnimal;
        String response;
        ArrayList <Animal> animalList = new ArrayList<Animal>();

        while(true){
            System.out.println("Enter your animal's name: ");
            nameOfAnimal = scanner.nextLine();
            if (nameOfAnimal.isBlank()){
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            response = scanner.nextLine();

            boolean isItYes = isItYes(response);
            animalList.add(new Animal(nameOfAnimal,isItYes));
        }

        print(animalList);

    }

    private static boolean isItYes(String response) {
        boolean isItYes;
        if (response.equalsIgnoreCase("yes")) {
            isItYes = true;
        } else {
            isItYes = false;
        }
        return isItYes;
    }

    private static void print(ArrayList <Animal> animals){
        for (int i = 0; i< animals.size(); i++){
            System.out.println(animals.get(i).toString());
        }
    }


}
