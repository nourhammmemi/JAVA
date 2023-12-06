package tn.esprit.gestionzoo.main;
import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    //int nbrCages = 20;
    String ZooName = "my Zoo";
    public static void main(String[] args) {
      /*ZooManagement ZM = new ZooManagement() ;
        System.out.println(ZM.ZooName+" comporte "+ZM.nbrCages+" cages");
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le nom du Zoo : ");
        ZM.ZooName = scanner.nextLine();
        System.out.println("le nom du zoo est " +ZM.ZooName);
        System.out.println("donner le nombre de cage : ");
        ZM.nbrCages = scanner.nextInt();
        System.out.println("le nombre des cages est :  " +ZM.nbrCages);
*/

     /*   Animal a1 = new Animal();
        a1.setFamily("cats");
        a1.setFamily("lion");
        a1.setAge(5);
        a1.setMammal(true);

        Zoo z1=new Zoo();
        z1.setName("zoo ");
        z1.setCity("Tunis");
       // z1.nbrCages=3;
        z1.setAnimals (new Animal[z1.nbrCages]);
        Animal a2 = new Animal("cats","tigre",-6,true);
        Animal a3 = new Animal("birds","aigle",4,true);
        Animal a4= new Animal("birds","bird",4,true);

        Animal[] animals ={a1,a2,a3};

        //Zoo z1= new Zoo(animals,"zoo 1","Tunis");
        Zoo z2= new Zoo(animals,"","Tunis");

        /* Les nouveaux constructeurs paramétrés permettent
    d'initialiser les objets "Animal" et "Zoo" directement
    lors de leur création en fournissant les valeurs des attributs e
    n un seul appel au constructeur, ce qui simplifie le code et le rend plus lisible.*/
     /*   System.out.println("**********liste des zoo*********");
        z2.displayZoo();
        z1.displayZoo();

        System.out.println("************liste des zoo**************");
        System.out.println(z1);  // affichera l'adresse mémoire de l'objet,
        System.out.println(z2.toString()); /* Cela appelle la méthode
        toString() sur l'objet "z1". Si vous n'avez pas redéfini la méthode
        toString() dans la classe "Zoo, cela affichera l'adresse mémoire de l'objet.*/

      /*  System.out.println("***********Ajout animals zoo1***********");
        //System.out.println(z1.addAnimal(a1));
        //System.out.println(z1.addAnimal(a2));
        System.out.println("***********Ajout animals zoo2***********");

        System.out.println(z2.addAnimal(a3));

        System.out.println("***********zoo1*************");
        z1.displayAnimals();
        System.out.println("***********zoo2*************");
        z2.displayAnimals();

        System.out.println("********search dans zoo1*********");
        System.out.println(z1.searchAnimal("tigre"));

        System.out.println("********search dans zoo2*********");
        System.out.println(z2.searchAnimal("tigre"));


        System.out.println("**************************");
        System.out.println(z1.addAnimal(a1));

       // System.out.println("***********zoo1***************");
        //System.out.println(z1.isZooFull());
      //System.out.println("*************zoo2*************");
      //  System.out.println(z2.isZooFull());

        System.out.println("*********le zoo avec le plus d'animaux *****************");
        System.out.println(Zoo.comparerZoo(z1,z2));

        System.out.println("***********Ajout animals zoo1 avce isZooFull***********");
        System.out.println(z1.addAnimal(a4));


*/


        Aquatic[] aquatics =new Aquatic[10];
        Zoo z1= new Zoo(aquatics,"zoo 1","Tunis");

        Zoo z2=new Zoo();
        z1.setName("zoo 2");
        z1.setCity("Tunis");

        Animal animal = new Animal();
       //Aquatic aquatic = new Aquatic();


        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        Terrestrial terrestrial = new Terrestrial();

        animal.name = "tigre";
        animal.age = 5;
        animal.isMammal = true;

        /*aquatic.name = "poison";
        aquatic.age = 3;
        aquatic.isMammal = false;
        aquatic.setHabitat("Ocean");*/

        dolphin.name = "Dolphin";
        dolphin.age = 10;
        dolphin.isMammal = false;
        dolphin.setHabitat("Ocean");
        dolphin.setSwimmingSpeed(15);

        penguin.name = "Penguin";
        penguin.age = 8;
        penguin.isMammal = false;
        penguin.setHabitat("antratica");
        penguin.setSwimmingDepth(50);

        terrestrial.name = "elephant";
        terrestrial.age = 4;
        terrestrial.isMammal = true;
        terrestrial.setNbrLegs(4);

        /*aquatic.name = "orca";
        aquatic.age = 12;
        aquatic.isMammal = false;
        aquatic.setHabitat("Ocean");

        aquatic.name = "requin";
        aquatic.age = 3;
        aquatic.isMammal = false;
        aquatic.setHabitat("Ocean");*/



        System.out.println(animal.name);
        //System.out.println(aquatic.name);
        System.out.println(dolphin.name);
        System.out.println(penguin.name);
        System.out.println(terrestrial.name);

        //System.out.println(aquatic.toString());
        System.out.println(penguin.toString());
        System.out.println(dolphin.toString());

        //aquatic.swim();
        penguin.swim();
        dolphin.swim();

        z1.addAquaticAnimal(dolphin);
        z1.addAquaticAnimal(penguin);
        z1.maxPenguinSwimmingDepth();
        float maxPenguinDepth = z1.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : " + maxPenguinDepth + " mètres.");
        z1.displayNumberOfAquaticsByType();

        //z2.addAquaticAnimal(dolphin);



       //z1.addAquaticAnimal();



    }





}