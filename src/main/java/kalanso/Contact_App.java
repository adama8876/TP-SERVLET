/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalanso;

/**
 *
 * @author adama.konate1
 */
public class Contact_App {
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String telephone;
    //private String dateNaissance;
  //  private String adresse;
    private String competenceFavorite;

    public Contact_App() {
    }

    public Contact_App(int id) {
        this.id = id;
    }

    public Contact_App(int id, String prenom, String nom, String email, String telephone, String competenceFavorite) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
       // this.dateNaissance = dateNaissance;
       // this.adresse = adresse;
        this.competenceFavorite = competenceFavorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

  /*  public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }*/

    /*public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }*/

    public String getCompetenceFavorite() {
        return competenceFavorite;
    }

    public void setCompetenceFavorite(String competenceFavorite) {
        this.competenceFavorite = competenceFavorite;
    }

    @Override
    public String toString() {
        return "Contact_App{" + "id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", telephone=" + telephone + ",  competenceFavorite=" + competenceFavorite + '}';
    }
    
}
