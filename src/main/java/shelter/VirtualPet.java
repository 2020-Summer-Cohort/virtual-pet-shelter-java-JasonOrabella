package shelter;

//In addition to the requirements from last week's project:
//
//include instance variables representing:
//name (from the above example, this might be "Tommy")
//description (from the above example, this might be "smells like a Stargazer lily fresh with morning dew")
//include a constructor that accepts a name and description
//include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)
//Do not include a default (zero arguments) constructor.
import java.util.Random;

public class VirtualPet {
    String name;



    String description;
    int hunger;
    int thirst;
    int boredom;

//    VirtualPet(String name, String description){
//        this.name =name;
//        this.description = description;
//
//    }



    VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
//        Random randomV = new Random();
//        Random randomU = new Random();
//        Random randomW = new Random();
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
//        this.thirst = randomV.nextInt(50);;
//        this.hunger =  randomU.nextInt(50);
//        this.boredom = randomW.nextInt(50);
    }

    VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}