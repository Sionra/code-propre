package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Crée une zone pour le Zoo
 */
public class Zone {
    private String nom;
    private double nourriture;
    private List<Animal> animals;

    /**
     * Crée une zone comportant un nom, le type de nourriture et une liste d'animal dans la zone
     *
     * @param nom        Nom de la zone
     * @param nourriture
     */
    public Zone(String nom, double nourriture) {
        this.nom = nom;
        this.nourriture = nourriture;
        this.animals = new ArrayList<>();
    }

    /**
     * Ajoute un animal dans l'aquarium
     *
     * @param animal
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    /**
     * Affiche la liste des animaux dans la zone
     */
    public void afficherListeAnimaux(){
        for (Animal ani: animals){
            System.out.println(ani.getNom());
        }
    }

    public double calculerKgsNourritureParJour() {
        return this.animals.size() * this.nourriture;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNourriture() {
        return nourriture;
    }

    public void setNourriture(double nourriture) {
        this.nourriture = nourriture;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
