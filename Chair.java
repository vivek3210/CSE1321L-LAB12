public class Chair {
    public int numOfLegs;
    public boolean rolling;
    public String material;

    public Chair(){
        numOfLegs = 4;
        rolling = false;
        material = "wood";
        System.out.println("Your chair has " + numOfLegs + " legs, is not rolling, and is made of " + material + ".");
    }
    public Chair(int n, boolean r, String m){
        numOfLegs = n;
        rolling = r;
        material = m;
        if (r == true)
        {
            System.out.println("Your chair has " + numOfLegs + " legs, is rolling, and is made of " + material + ".");
        }
        else {
            System.out.println("Your chair has " + numOfLegs + " legs, is not rolling, and is made of " + material + ".");
        }
    }
}