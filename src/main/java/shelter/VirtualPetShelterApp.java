package shelter;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
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


    //print pets' stats (the array list)
    //what would you like to do
    //ask user for input scanner
    //sout options  feed etc
    //if then tick method
    // prints pets stats array list


    public static void main(String[] args) {

        VirtualPetShelter vps = new VirtualPetShelter();


//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Baldur");
////        list.add("Nick");
//        list.add("Gary");
//        list.add("Sammy");
        System.out.println("Welcome to Dr.Jayakumars pet shelter and Award winning Aquarium!");
        int run;
        run = 1;
//        VirtualPet vp = new VirtualPet('Fido');

        while (run == 1) {


            // System.out.println(); print array list place hold

            System.out.println("What would you like to do next?");
            System.out.println("1.Feed the Pets");
            System.out.println("2.Water the Pets");
            System.out.println("3.Play with a Pet");
            System.out.println("4. Adopt a New Pet");
            System.out.println("5. Admit a New Pet");
            System.out.println("6. Quit");
            System.out.println("Please enter 1-6 for your choice");
            Scanner userInputScannerMain = new Scanner(System.in);
            int getAction = userInputScannerMain.nextInt();

            if (getAction == 1) {
                vps.feedAll();

                System.out.println("You feed all your Pets");

                //(virtualPetShelter.feedPets();
                // virtualPetShelter.tick();
            } else if (getAction == 2) {
                vps.waterAll();
                System.out.println("You put out water for all your Pets.");

                //
                //
            } else if (getAction == 3) {
                System.out.println(vps.list);
                System.out.println(" Pet you would like to Play with?");

                //print array list



            }
            else if (getAction ==6){
                run = 0;
            }

        }}}



