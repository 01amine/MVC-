package model;

import vue.IObservateur;

public interface ISujetModel {
    void ajouterObservateur(IObservateur observateur);
    void supprimerObservateur(IObservateur observateur);
    void notifier();
}
