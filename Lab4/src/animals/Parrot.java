package animals;

public class Parrot extends Animal {

    public Parrot(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    public int getLegs(){
        return this.legs;
    }

    @Override
    public String getDescription() {
        return "Papuga lata";
    }
}
