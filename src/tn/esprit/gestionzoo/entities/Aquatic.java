package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivor;
import tn.esprit.gestionzoo.entities.enums.Food;

public  class Aquatic extends Animal implements Carnivor<Food> {

    protected String habitat;

  public Aquatic(){
      super();
      System.out.println("Aquatic");

   }
    public void eatMeat(Food meat){
        if(meat == Food.MEAT || meat==Food.BOTH){
            System.out.println("The animal is aquatic");
        }else
            System.out.println("The animal is not aquatic");
    }
   public Aquatic(String family, String name, int age, boolean isMammal,String habitat)
   {
       super(family,name,age,isMammal);
       this.habitat=habitat;
   }
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    public  void swim()
    {System.out.println("This aquatic animal is swimming.");}
    public String getHabitat() {
      return habitat;}

    public void setHabitat(String habitat) {
       this.habitat = habitat;}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}
