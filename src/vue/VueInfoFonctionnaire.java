package vue;

import controler.IControleurFonctionnaire;
import model.IModelFonctionaire;

public class VueInfoFonctionnaire extends VueFonctionnaire{
    private IModelFonctionaire iModel ;
    private IControleurFonctionnaire iControleur ;
    public VueInfoFonctionnaire(IModelFonctionaire iModel , IControleurFonctionnaire iControleur){
        this.iControleur = iControleur;
        this.iModel = iModel;
    }
    public void activerVue(){

    }
    public void actualiser(){

    }
    public void saisir(){

    }
    public void afficher(){

    }
    public String saisirIdentifiant(){
        return "";
    }
    public String saisirNom(){
        return "";
    }
    public String saisirPrenom(){
        return "";
    }
    public String saisirAffectation(){
        return "";
    }
}
