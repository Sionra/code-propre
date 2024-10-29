package ex3;

/**
 * La définition d'un annimal
 */
public class Animal {
    private String type;
    private String nom;
    private String comportement;

    /**
     * Crée un animal qui a un type, un nom et un comportement
     * @param type
     * @param noms
     * @param comportements
     */
    public Animal(String type, String noms, String comportements) {
        this.type = type;
        this.nom = noms;
        this.comportement = comportements;
    }

    /**
     * Getter pour types
     * @return
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter pour Type
     * @param types
     */
    public void setTypes(String types) {
        this.type = types;
    }

    /**
     * Getter pour lee nom
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom
     * @param noms
     */
    public void setNoms(String noms) {
        this.nom = noms;
    }

    /**
     * Getter pour le comportement
     * @return
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter pour le comportement
     * @param comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
