import java.util.Scanner;
public class Lab12B {
    public static void main(String[] args){
        int dogAge;
        double dogWeight;
        double addWeight;
        String dogName;
        String dogColor;
        String dogBreed;

        Scanner input = new Scanner(System.in);

        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        dogAge = input.nextInt();
        System.out.print("How much does the dog weigh: ");
        dogWeight = input.nextDouble();
        System.out.print("What is the dog's name: ");
        dogName = input.next();
        System.out.print("What color is the dog: ");
        dogColor = input.next();
        System.out.print("What breed is the dog: ");
        dogBreed = input.next();

        Dog newDog = new Dog(dogAge, dogWeight, dogName, dogColor, dogBreed);

        Dog.bark("Woof! Woof!");
        //print out the new name
        System.out.println(dogName + " is hungry, how much should he eat: ");
        addWeight = input.nextDouble();
        System.out.println(dogName + " isn't a very good name. What should they be renamed to: ");
        dogName = input.next();
        newDog.rename(dogName);

        System.out.println(dogName + " is a " + dogAge + " year old " + dogColor + " " + dogBreed + " that weighs " + newDog.eat(addWeight) + " lbs.");



    }
}
