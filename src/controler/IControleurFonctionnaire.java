package controler;

import vue.IVueFonctioannaire;

public interface IControleurFonctionnaire {
    public void setVue(IVueFonctioannaire iVue);
    public void ajouterVue(IVueFonctioannaire iVue);
    public void gererVue();
    public void gererSaisiVueFonctionnaire();
    public void gererSaisiVueDiplome();
}
