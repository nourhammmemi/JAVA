package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Omnivore;
import tn.esprit.gestionzoo.entities.enums.Food;

public final  class Terrestrial extends Animal implements Omnivore<Food> {

private int nbrLegs;

public Terrestrial(){

}
public Terrestrial( String family, String name, int age, boolean isMammal,int nbrLegs){
    super(family,name,age,isMammal);
    this.nbrLegs=nbrLegs;
}
    public void eatPlant (Food plant){
        if(plant==Food.PLANT || plant==Food.BOTH){
            System.out.println("The animal is terrestrial");
        }else
            System.out.println("The animal is not terrestrial");
    }
    public void eatMeat(Food meat){
        if(meat == Food.MEAT || meat==Food.BOTH){
            System.out.println("The animal is aquatic");
        }else
            System.out.println("The animal is not aquatic");
    }
    public void eatPlantAndMeat(Food food){
        if (food==Food.BOTH){
            System.out.println("The animal is eating meat and plants");
        }else
            System.out.println("The animal can't be eating just one type of food");
    }
    @Override
    public String toString() {
        return super.toString()+ " number of legs :"+ nbrLegs;
    }
  public int getNbrLegs() {
      return nbrLegs;
    }
  public void  setNbrLegs(int nbrLegs)
    {
        this.nbrLegs=nbrLegs;
  }

}
