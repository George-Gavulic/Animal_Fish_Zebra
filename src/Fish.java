public class Fish extends Animal {
    private double sizeInFeet;

    public Fish(int age, String gender, double sizeInFeet) {
        super(age, gender);
        this.sizeInFeet = sizeInFeet;
    }

    
    public boolean isMammal() {
        System.out.print("(run from fish class)");
        return false;
    }

    public double getSizeInFeet() {
        return sizeInFeet;
    }

    private boolean canEat(){
        if (age <= 5){
            return true; 
        } else {
            return false;
        }
    }

    public String eat() {
        if (canEat()){
            return "Fish is eating";
        } else {
            return "Fish is not hungry";
        }
    }
}
