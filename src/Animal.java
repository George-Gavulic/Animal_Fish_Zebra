public class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        System.out.print("(run from animal class)");
        return true;
    }

    public String mate() {
        return"This animal can mate";
    }

    public static void main(String[] args) {
        Fish myFish = new Fish(2, "Female", 1.5);
        Zebra myZebra = new Zebra(5, "male", true);

        System.out.println("The Fish is a Mammal: " + myFish.isMammal());
        System.out.println("Size of fish: " + myFish.getSizeInFeet());
        System.out.println("Asking the fish to eat: " + myFish.eat());
        System.out.println("Can the fish mate? " + myFish.mate());
        System.out.println("The Fish is a Mammal: " + myFish.isMammal());

        System.out.println("This Zebra is wild: " + myZebra.getWild());
        System.out.println("Asking the Zebra to run: " + myZebra.run());
        System.out.println("Can the Zebra mate? " + myZebra.mate());
        System.out.println("The Zebra is a Mammal: " + myZebra.isMammal());





    }


}
