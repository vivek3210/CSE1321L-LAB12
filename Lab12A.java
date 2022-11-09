import java.util.Scanner;
public class Lab12A {
    public static void main(String[] args) {
        int l;
        boolean r;
        String m;
        Scanner input = new Scanner(System.in);

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        l = input.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        r = input.nextBoolean();
        System.out.print("What is your chair made of: ");
        m = input.next();

        Chair chair1 = new Chair(l,r,m);

        System.out.println("This program is going to change that.");
        Chair originalChair = new Chair();



    }
}
