package ex1;

import java.util.Date;

public class Entreprise {

    /**
     * Numéro Siret de l'entreprise
     */
    public int siret;
    /**
     * Nom de l'entreprise
     */
    public String nom;
    /**
     * Adresse de l'entreprise
     */
    public String adresse;
    /**
     * Date de creation de l'entreprise
     */
    public Date dateCreation;
    /**
     * Capital max de l'entreprise
     */
    public final int capitalMax = 3000000;

    /**
     * Permet d'afficher les variable de la Class
     */
    public void afficherStatut() {
        System.out.println("Numéro Siret : " + this.siret +
                "\nNom : " + this.nom +
                "\nAdresse : " + this.adresse +
                "\nDate de création : " + this.dateCreation +
                "\nCapital max : " + this.capitalMax);
    }

    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getCapitalMax() {
        return capitalMax;
    }
}
