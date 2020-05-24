package shelter;

import java.util.*;


//tick method include appropriate instance variable(s) to store the pets who reside at the shelter
//include methods that:
//return a Collection of all of the pets in the shelter
//return a specific VirtualPet given its name
//allow intake of a homeless pet (adding a pet to the shelter)
//allow adoption of a homeless pet (removing a pet from the shelter)
//feed all of the pets in the shelter
//water all of the pets in the shelter
//plays (or performs some other interaction(s)) with an individual pet in the shelter
//include a tick method that calls the tick method for each of the pets in the shelter,
// updating their needs

public class VirtualPetShelter {

//    int hunger;
//    int thirst;
//    int boredom;
    VirtualPet p1;
    VirtualPet p2;
    VirtualPet p3;
    ArrayList<VirtualPet> list;
    Iterator itr;
    Iterator itr1;


    //    ArrayList<String> name;
//    ArrayList<String> description;
//    ArrayList<Integer> hunger;
//    ArrayList<Integer> thirst;
//    ArrayList<Integer> boredom;
    VirtualPetShelter() {
        p1 = new VirtualPet("Baldur","cute",25,25,25);
        p2 =  new VirtualPet("Nick","gray",25,25,25);
        p3 = new VirtualPet("Gary","snail",25,25,25);
        list = new ArrayList<VirtualPet>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

//        p4 =  new VirtualPet("Sammy","cute",25,25,25);
//        Map<VirtualPet,Integer> virtualPetIntegerMap=new HashMap<VirtualPet,Integer>();{
//        virtualPetIntegerMap.put("name",1,2,4,1);
//    Map map = new HashMap();
//        VirtualPet vp1 = new VirtualPet("test1","test2",10,10,10);
//        name = new ArrayList<String>();
//        name.add("Baldur");
//        name.add("Nick");
//        name.add("Gary");
//        name.add("Sammy");
//        description = new ArrayList<String>();
//        name.add("Cute furry orange cat");
//        name.add("Cute furry gray boy");
//        name.add("Slimy underwater boy");
//        name.add("ferocious monster dog");
//        hunger = new ArrayList<Integer>();
//        hunger.add(25);
//        hunger.add(25);
//        hunger.add(25);
//        hunger.add(25);
        }
        public ArrayList<VirtualPet> petsAvailable(){

            return list;

        }
//        public string  addNewPetName
//        }


//        public void addPet(string name, string description){
//
//        }
//        public void playPet(string name){
//
//        }
        public void waterAll(){

            itr1 = list.iterator();
            while (itr1.hasNext()){
                VirtualPet p = (VirtualPet)itr1.next();
                p.thirst -= 20;
            }



        }
        public void feedAll(){

        itr = list.iterator();
        while (itr.hasNext()){
            VirtualPet p = (VirtualPet)itr.next();
            p.hunger -= 20;
        }


        }
        public void tick(){
            itr = list.iterator();
            while (itr.hasNext()){
                VirtualPet p = (VirtualPet)itr.next();
                p.hunger += 5;
                p.thirst += 5;
                p.boredom +=5;
            }

        }

}






