package ex3;
public class Zoo {

	private String nom;
	private Zone savaneAfricaine;
	private Zone zoneCarnivore;
	private Zone fermeReptile;
	private Zone aquarium;

	/**
	 * Permet de crée un Zoo en donnant son nom en paramétre
	 * @param nom
	 */
	
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new Zone("Savane Africaine", 10);
		this.zoneCarnivore = new Zone("Zone Carnivore", 10);
		this.fermeReptile = new Zone("Ferme Reptile", 0.1);
		this.aquarium = new Zone("Aquarium", 0.2);
	}

	/**
	 * Ajoute un animal dans son enclos selon son type et son comportement
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getType().equals("REPTILE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getType().equals("POISSON")){
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * Affiche la liste des annimaux de tout les types
	 */
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}