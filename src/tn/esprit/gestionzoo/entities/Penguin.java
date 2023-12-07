package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin() {
    }
       public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){
           super(family,name,age,isMammal,habitat);
           this.swimmingDepth=swimmingDepth;
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
