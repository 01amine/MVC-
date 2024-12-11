package model;

import vue.IObservateur;

public class ModelFonctionaire implements IModelFonctionaire{

    private String identifiant ;
    private String nom;
    private String prenom;
    private String affectation;
    private Diplome diplome;
    @Override
    public String getIdentifiant(){
        return this.identifiant;
    }
    @Override
    public void setIdentifiant(String identifiant){
        this.identifiant = identifiant;
    }
    @Override
    public String getNom(){
        return nom;
    }
    @Override
    public void setNom(String nom){
        this.nom = nom;
    }
    @Override
    public String getPrenom(){
        return prenom;
    }
    @Override
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    @Override
    public String getAffectation(){
        return affectation;
    }
    @Override
    public void setAffectation(String affectation){
        this.affectation = affectation;
    }
    @Override
    public void misAjour(String identifiant, String nom, String prenom, String affectation){

    }
    @Override
    public String getGrade(){
        return diplome.getGrade();
    }
    @Override
    public String getSpecialite(){
        return diplome.getSpecialite();
    }
    @Override
    public void misAjourDiplome(String grade, String specialite){

    }
    void ajouterObservateur(IObservateur observateur){

    }
    void supprimerObservateur(IObservateur observateur){

    }
    void notifier(){

    }
    @Override
    public void actualiser() {

    }
}
