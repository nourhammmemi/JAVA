package tn.esprit.gestionzoo.entities;
public class Animal {
    public String family ;
    public String name ;
    public int age ;
    public boolean isMammal;
    public Animal(){

    }
    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age);
setMammal(isMammal);    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void setAge(int age) {
        if (age >= 0) {
        this.age = age;
    }
     else {
        // Gérez l'erreur ici, vous pouvez lancer une exception ou effectuer d'autres actions appropriées.
        System.err.println("L'âge du "+name+" ne peut pas être négatif.");
    }

    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
