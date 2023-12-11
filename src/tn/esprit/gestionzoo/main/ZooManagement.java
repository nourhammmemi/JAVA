package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.interfaces.*;
import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void  main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character...

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages ");


        Animal lion = new Animal("L","Lion1",7,true);
        Animal lion1 = new Animal("L2","Lion2",6,true);


        Zoo myZoo = new Zoo("zoo","sousse") ;

        // Création d'animaux
        Animal pig = new Animal("Pi", "Pig", 5, true);
        Animal penguin = new Animal("Pen", "Penguin", 10, true);

        int indexLion = myZoo.searchAnimal(lion);
        int indexLion1 = myZoo.searchAnimal(lion1);

        if (indexLion != -1) {
            System.out.println("Lion 1 trouvé à l'indice " + indexLion);
        } else {
            System.out.println("Lion 1 non trouvé.");
        }

        if (indexLion1 != -1) {
            System.out.println("Lion 2 trouvé à l'indice " + indexLion1);
        } else {
            System.out.println("Lion 2 non trouvé.");
        }


        // Création d'animaux
        Animal lion3 = new Animal("YYY", "Lion", 2, true);
        Animal elephant = new Animal("EEE", "Elephant", 4, true);
        Animal giraffe = new Animal("GGG", "Giraffe", 5, false);

        Zoo zoo1 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 1","TUNIS"); // I shouldn't add the 3rd param
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 2","SOUSSE");

        // Vérification si les zoo sont pleins
        System.out.println("tn.esprit.gestionzoo.entities.Zoo 1 est plein : " + zoo1.isZooFull()); // It should be false
        System.out.println("tn.esprit.gestionzoo.entities.Zoo 2 est plein : " + zoo2.isZooFull()); // It should be false too

        // Comparaison des zoo
        Zoo zooWithMostAnimals = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooWithMostAnimals.getName());

        //Aquatic aqua1 = new Aquatic();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        //Aquatic aqua2 = new Aquatic("AquaticFamily", "AquaticAnimal", 10, true, "AquaticHabitat");
        Dolphin dol2 = new Dolphin("DolphinFamily", "Dolphin", 5, true, "Ocean", 20.0f);
        Penguin pen2 = new Penguin("PenguinFamily", "Penguin", 3, true, "Antarctica", 10.0f);

        // Print the objects
        //System.out.println(aqua2);
        System.out.println(dol2);
        System.out.println(pen2);

        //aqua2.swim();
        dol2.swim();
        pen2.swim();

        Zoo myZoo2 = new Zoo("Zooooo","Tunis");


        Aquatic penguinn = new Penguin();
        Aquatic dolphin = new Dolphin();

        myZoo2.addAquaticAnimal(penguinn);
        myZoo2.addAquaticAnimal(dolphin);


        for (Aquatic animal : myZoo2.AquaticAnimals) {
            if (animal != null) {
                animal.swim();
            }
        }
        Aquatic aquaticAnimal = new Aquatic("AquaticFamily", "AquaticAnimal", 10, true, "AquaticHabitat");

        // Test the eatMeat method with Carnivore interface
        System.out.println("Testing eatMeat method:");
        aquaticAnimal.eatMeat(Food.MEAT); // This should print "This aquatic animal is eating meat."
        aquaticAnimal.eatMeat(Food.PLANT); // This should print "This aquatic animal does not eat meat."

        // Create an instance of Terrestrial
        Terrestrial terrestrialAnimal = new Terrestrial("TerrestrialFamily", "TerrestrialAnimal", 8, true, 4);

        // Test the eatPlantAndMeat method with Omnivore interface
        System.out.println("\nTesting eatPlantAndMeat method:");
        terrestrialAnimal.eatPlantAndMeat(Food.BOTH); // This should print "This terrestrial animal is eating both plants and meat."
        terrestrialAnimal.eatPlantAndMeat(Food.MEAT); // This should print "This terrestrial animal does not eat both plants and meat."


        scanner.close();
    }
}
