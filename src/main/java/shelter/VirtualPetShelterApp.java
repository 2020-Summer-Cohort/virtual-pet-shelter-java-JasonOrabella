package shelter;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

//Create a main method that…
//
//implements a game loop.
//asks for user input.
//writes output to the console.
//calls VirtualPetShelter's tick method after each interaction
//Available user interface actions should include (at minimum)…
//
//feeding all the pets
//watering all the pets
//playing with an individual pet, which should display a list of pet names and descriptions,
// allowing a user to select one
//allow adoption of a pet, which should display a list of pet names and descriptions,
// allowing a user to select one. NOTE: In the past this has been a bit confusing.
// Keep in mind you are playing the role of a shelter worker, if a pet is adopted it will be removed from the shelter.
//allow intake of a pet, prompting the user for the pet's information,
// requiring the user to (at minimum) specify name and description

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter vps = new VirtualPetShelter();

        ArrayList<VirtualPet> l1 = new ArrayList<VirtualPet>();

        System.out.println("Welcome to Dr.Jayakumars pet shelter and Award winning Aquarium!");
        int run;
        run = 1;

        while (run == 1) {
            System.out.println(vps.list.size());
            if (vps.list.size() != 0) {
                System.out.println("Pet Status:");
                System.out.println("Name | Boredom | Hunger | Thirst ");
                for (int i = 0; i < vps.list.size(); i++) {

                    System.out.println(vps.list.get(i).getName() + "\t" + "\t" + vps.list.get(i).getBoredom() +
                            "\t" + "\t" + vps.list.get(i).getHunger() + "\t" + "\t" + vps.list.get(i).getThirst());
                }
//            System.out.println(vps.list.get(i).description);}
            }

            System.out.println("What would you like to do next?");
            System.out.println("1.Feed the Pets");
            System.out.println("2.Water the Pets");
            System.out.println("3.Play with a Pet");
            System.out.println("4. Adopt a New Pet");
            System.out.println("5. Admit a New Pet");
            System.out.println("6. Quit");
            System.out.println("Please enter 1-6 for your choice");

            Scanner userInputScannerMain = new Scanner(System.in);
            int getActionNumber = userInputScannerMain.nextInt();

            if (getActionNumber == 1) {
                vps.feedAll();
                vps.tick();
                System.out.println("You feed all your Pets");

            } else if (getActionNumber == 2) {
                vps.waterAll();
                vps.tick();
                System.out.println("You put out water for all your Pets.");


            } else if (getActionNumber == 3) {
                for (int i = 0; i < vps.list.size(); i++) {
                    System.out.println(vps.list.get(i).name);
                    System.out.println(vps.list.get(i).description);
                }
                System.out.println("Pet you would like to Play with?");
                Scanner stringScanner = new Scanner(System.in);
                String getActionString = stringScanner.next();
                for (int i = 0; i < vps.list.size(); i++) {
                    if (getActionString.equalsIgnoreCase(vps.list.get(i).name)) {
                        vps.playWithPet(getActionString);
                        System.out.println("You played with" + " " + (vps.list.get(i).name));

                    }
                }
                vps.tick();

            } else if (getActionNumber == 4) {
                    if (vps.list.size() >= 1) {
                for (int i = 0; i < vps.list.size(); i++) {
                    System.out.println(vps.list.get(i).getName() + "\t"
                            + vps.list.get(i).getDescription());
                }
                System.out.println("Pet you would like to Adopt ?");
                Scanner stringScanner = new Scanner(System.in);
                String getActionString = stringScanner.next();
                for (int i = 0; i < vps.list.size(); i++) {
                    if (getActionString.equalsIgnoreCase(vps.list.get(i).name)) {
                        l1= vps.removePet(getActionString);
                    }
                }
                //need a remove pet method on this line
                System.out.println("The Pets now in the shelter are");
                for (int i = 0; i < l1.size(); i++) {
                    System.out.println(l1.get(i).name);
                }
                vps.tick();
                    } else {
                        System.out.println("No more pets available for adoption");
                    }

            } else if (getActionNumber == 5) {
                System.out.println("Whats the name of the pet you would like to drop off?");
                Scanner stringScanner = new Scanner(System.in);
                String getActionString = stringScanner.next();
                System.out.println("Whats the description of the pet you would like to drop off?");
//                Scanner stringScanner2 = new Scanner(System.in);
                String getActionString2 = stringScanner.next();
                VirtualPet userPetNew = new VirtualPet(getActionString, getActionString2, 25, 25, 25);
                vps.addPet(userPetNew);
                System.out.println("The Pets now in the shelter are");
                for (int i = 0; i < vps.list.size(); i++) {
                    System.out.println(vps.list.get(i).name);
                }
                vps.tick();

            } else if (getActionNumber == 6) {
                run = 0;
            }

        }

    }

}




