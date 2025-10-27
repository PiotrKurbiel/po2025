package animals;

public class Snake extends Animal{
    public Snake(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    public int getLegs(){
        return this.legs;
    }

    @Override
    public String getDescription() {
        return "Wonsz rzeczny";
    }
}
