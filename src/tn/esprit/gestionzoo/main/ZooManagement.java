package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
//import java.util.Scanner;

public class ZooManagement {
    public static void  main (String[] args)
    {    // scanner =permet de lire l'entrée de l'utilisateur à partir de la console.

       // int nbrCages = 20;
      //  String zooName ="my zoo";
      //  System.out.println(zooName +" comporte "+nbrCages+" cages");
       // Scanner scanner = new Scanner(System.in);

       // System.out.println(" entrer le nombre de cages du zoo :");
      //  int  nbrCages = scanner.nextInt();

      //  System.out.println("entrer le nom du zoo :");
      //  String zooName =scanner.next();

      //  System.out.println(zooName +" comporte "+nbrCages+" cages" );


       //lion.age = 5;
       // lion.family = "Cats";
      //lion.isMammal = true;

      // Zoo myzoo = new Zoo();
    //   myzoo.name="Frigia";
     //  myzoo.city="Hammamet";
      // myzoo.nbrCages=4;
     //  myzoo.animals= new tn.esprit.gestionzoo.entities.Animal[25];


        Animal lion = new Animal();
        lion.setName("Simba");
        try {
            lion.setAge(8);
        }
        catch ( InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myzoo = new Zoo("Frigia", "Hammamet");
        Zoo notMyZoo = new Zoo("Belvedere", "Tunis");


        Animal dog = new Animal("Canine", "Pixie", 1, true);


        try {
            myzoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myzoo.getName() + " contient " + myzoo.getNbrAnimals() + " animaux");
        }
        try {
            myzoo.addAnimal(dog);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myzoo.getName() + " contient " + myzoo.getNbrAnimals() + " animaux");
        }

        myzoo.displayAnimals();

        System.out.println(myzoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Dido", 3, true);
        System.out.println(myzoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myzoo.displayAnimals();


        System.out.println(myzoo);

        try {
            myzoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myzoo.getName() + " contient " + myzoo.getNbrAnimals() + " animaux");
        }
       // myzoo.displayAnimals();

       // System.out.println(myzoo.searchAnimal(dog));
       // Animal dog2 = new Animal("Canine", "Pixie", 1, true);
      // System.out.println(myzoo.searchAnimal(dog2));

       // System.out.println(myzoo.removeAnimal(dog));
      // myzoo.displayAnimals();

        System.out.println(myzoo);

        //System.out.println(dog);


      //  Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
      //  Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
      //  Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
      //  Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


       // System.out.println(aquatic);
      //  System.out.println(terrestrial);
      //  System.out.println(dolphin);
      //  System.out.println(penguin);
      //  aquatic.swim();
       // dolphin.swim();

        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(15.5f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(16.5f);




        myzoo.addAquaticAnimal(d1);
        myzoo.addAquaticAnimal(d2);



        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(40.40f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(60.60f);

        myzoo.addAquaticAnimal(p1);
        myzoo.addAquaticAnimal(p2);

        myzoo.addAquaticAnimal(new Penguin());

       // for (int i = 0; i < myzoo.getNbrAquatics(); i++) {
        //    Aquatic[] aquatics = myzoo.getAquaticAnimals();
        //    aquatics[i].swim();
       // }


       // myzoo.displayNumberOfAquaticsByType();

       // System.out.println(myzoo.maxPenguinSwimmingDepth());

    }
}
