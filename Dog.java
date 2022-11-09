public class Dog {
    int age;
    double weight;
    String name;
    String furColor;
    String breed;

    public Dog(int a, double w, String n, String f, String b) {
        age = a;
        weight = w;
        name = n;
        furColor = f;
        breed = b;

        System.out.println(name + " is a " + age + " year old " + furColor + " " + breed + " that weighs " + weight + " lbs.");

    }

    public static void bark(String bark){
        bark = "Woof! Woof!";
        System.out.println(bark);

    }

    public String rename(String n)
    {
        name = n;
        return name;
    }

    public Double eat(double addWeight)
    {
        weight = weight + addWeight;
        return weight;
    }
}
