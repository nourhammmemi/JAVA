package tn.esprit.gestionzoo.interfaces;


public interface Omnivore <T> extends Carnivor<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);
}