package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivor;
import tn.esprit.gestionzoo.entities.enums.Food;

public class Penguin extends Aquatic implements Carnivor<Food> {
    private float swimmingDepth;

    public Penguin() {
    }
       public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){
           super(family,name,age,isMammal,habitat);
           this.swimmingDepth=swimmingDepth;
        }
    public void eatMeat(Food meat){
        if(meat == Food.MEAT || meat==Food.BOTH){
            System.out.println("The animal is aquatic");
        }else
            System.out.println("The animal is not aquatic");
    }
    @Override
    public String toString() {

        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }

   public float getSwimmingDepth() {
        return swimmingDepth;}
    @Override
    public void swim() {
        System.out.println("A penguin is swimming");
    }
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;}

}
