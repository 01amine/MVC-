package controler;

import model.IModelFonctionaire;
import vue.IVueFonctioannaire;

public class ControleurFonctionnaire implements IControleurFonctionnaire{
    IModelFonctionaire iModel ;
    public ControleurFonctionnaire(IModelFonctionaire iModel){
        this.iModel = iModel;
    }

    @Override
    public void setVue(IVueFonctioannaire iVue) {

    }

    @Override
    public void ajouterVue(IVueFonctioannaire iVue) {

    }

    @Override
    public void gererVue() {

    }

    @Override
    public void gererSaisiVueFonctionnaire() {

    }

    @Override
    public void gererSaisiVueDiplome() {

    }
}
