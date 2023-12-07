package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {

    private String habitat;

  public Aquatic(){

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
    public abstract void swim();
  //  {System.out.println("This aquatic animal is swimming.");}
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
