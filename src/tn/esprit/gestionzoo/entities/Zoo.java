package tn.esprit.gestionzoo.entities;
public class Zoo {
    public Animal [] animals ;

    public  Aquatic [] aquaticAnimals = new Aquatic[10];
    String name;
    String city ;
    public int nbrCages;
     public int animalCount;

    public Zoo(){

    }

    public Zoo(Aquatic[] animals, String name, String city)  {
        setAnimals(animals);
        setName(name);
      setCity(city);
      //this.animals =animals;
        this.animalCount = 0;
        this.aquaticAnimals = animals;
    }





    public void displayZoo(){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean addAnimal (Animal animal){
        if (!isZooFull()) {
            for (int i = 0; i < animalCount; i++) {
                if (animals[i] != null && animals[i].name.equalsIgnoreCase(animal.name)) {
                    System.out.println("le nom de l'animal existe dans le zoo.");
                    return false;

                }

            }
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        else  return false;
    }


   public void displayAnimals() {
        System.out.println("Liste des animaux :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Nom : " + animals[i].name);
            System.out.println("Famille : " + animals[i].family);
            System.out.println("Âge : " + animals[i].age + " ans");
            System.out.println("Mammifère : " + (animals[i].isMammal ? "Oui" : "Non"));

        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean isZooFull() {

        if (animalCount >= nbrCages) {
            System.out.println("Le zoo est plein !");
            return true;
        }
        else {
            System.out.println("Il y a de la place au zoo.");
            return false;
        }

    }
     public static Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (z1.animalCount>= z2.animalCount) {
            System.out.println("Le zoo1 avec le plus d'animaux!");
            return z1 ;
        }
        else {
            System.out.println("Le zoo2 avec le plus d'animaux!");

            return z2 ;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() ) {
            this.name = name;
        }
        else {
            System.err.println("Le nom du zoo ne peut pas être vide.");

        }

    }
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < 10; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Added aquatic animal: " + aquatic.name);
                return;
            }
        }
        System.out.println("Aquatic animals' section is full. Cannot add more.");
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 15 ; //

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimal;
                float penguinDepth = penguin.getSwimmingDepth();
                if (penguinDepth > maxDepth) {
                    maxDepth = penguinDepth;
                }
            }
        }

        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimal instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins dans le zoo : " + dolphinCount);
        System.out.println("Nombre de pingouins dans le zoo : " + penguinCount);
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }


    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
}

