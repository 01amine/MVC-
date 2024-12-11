package vue;

import controler.IControleurFonctionnaire;
import model.IModelFonctionaire;

public class VueFonctionnaireDiplome extends VueFonctionnaire{
    IModelFonctionaire iModel ;
    IControleurFonctionnaire iControleur ;
    public VueFonctionnaireDiplome(IModelFonctionaire iModel, IControleurFonctionnaire iControleur){
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
    public String saisirGrade(){
        return "";
    }
    public String saisirSpeciaite(){
        return "";
    }
}
