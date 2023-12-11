package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;


public class Animal {
   private String family,name;
   private int age;
   private boolean isMammal;
    public Animal() {

    }

    public   Animal(String family, String name, int age, boolean isMammal) {

    this.family = family;
    this.name = name;
    this.age = age;
    this.isMammal = isMammal;

    }
    public String getFamily(){

    return family;}
  public void setFamily(String family)  {

        this.family=family;
  }

public String getName() {
    return name;
}
public  void setName(String name) {
    this.name=name;
}
    public int getAge() {
        return age;
    }

    public void setAge(int age)throws InvalidAgeException {
        if (age > 0)
            throw new InvalidAgeException("The age must a positive number");
        else
                this.age = age;

    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public boolean getIsMammal() {
        return isMammal;
    }

   public static void main(String[] args) {
       String s = null;
      System.out.println(" ".isEmpty());
       System.out.println(" ".isBlank());
    }
    @Override
    public String toString() {
        return "Animal{ Family:" + family + ", Name: " + name + ", Age: " + age + ", isMammal: " + isMammal + "}";
}
}
