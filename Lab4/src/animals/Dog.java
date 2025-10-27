package animals;

public class Dog extends Animal {
    public Dog(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    public int getLegs(){
        return this.legs;
    }
    @Override
    public String getDescription() {
        return "Pies szczeka";
    }
}
