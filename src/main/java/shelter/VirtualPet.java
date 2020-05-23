package shelter;

import java.util.Random;

public class VirtualPet {
    String name;
    int hunger;
    int thirst;
    int boredom;

    private void VirtualPet(String name,int hunger, int thirst, int boredom) {
        Random randomV = new Random();
        Random randomU = new Random();
        Random randomW = new Random();
        this.name = name;
        this.thirst = randomV.nextInt(50);;
        this.hunger =  randomU.nextInt(50);
        this.boredom = randomW.nextInt(50);
    }

    private int getBoredom() {
        return boredom;
    }

    private int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }



}