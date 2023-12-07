package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
public class Zoo {
    static final int nbrCages = 25;
    private Animal[] animals;
    private String name;
    private String city;

    private Aquatic[] aquaticAnimals ;

    private int nbrAnimals;
    private int nbrAquatics;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatic[10];
        this.name = name;
        this.city = city;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("can't be empty");

        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public static int getNbrCages() {
        return nbrCages;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

  public   void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    public void addAnimal(Animal animal)throws ZooFullException {
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (isZooFull()) {
            throw new ZooFullException("The Zoo is full");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;

    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

   public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {

        return nbrAnimals == nbrCages;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }


    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[nbrAnimals] = aquatic;
        nbrAquatics++;
    }
    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                float penguinDepth = ((Penguin) aquatic).getSwimmingDepth();
                if (penguinDepth > maxDepth) {
                    maxDepth = penguinDepth;
                }
            }
        }
        return maxDepth;

    }
    public void displayNumberOfAquaticsByType()
    {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }
}