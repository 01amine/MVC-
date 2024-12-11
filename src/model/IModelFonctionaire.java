package model;

import vue.IObservateur;

public interface IModelFonctionaire extends IObservateur {
String getIdentifiant();
void setIdentifiant(String identifiant);
String getNom();
void setNom(String nom);
String getPrenom();
void setPrenom(String prenom);
String getAffectation();
void setAffectation(String affectation);
void misAjour(String identifiant,String nom,String prenom , String affectation);
String getSpecialite();
String getGrade();
void misAjourDiplome(String grade, String speciaite);
}
