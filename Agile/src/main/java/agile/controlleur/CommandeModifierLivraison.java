package agile.controlleur;

import agile.modele.Livraison;
import agile.modele.Temps;
import agile.modele.Tournee;

public class CommandeModifierLivraison implements Commande {

    protected Livraison livraison;
    protected Tournee tournee;
    protected Temps debutPlage;
    protected Temps finPlage;
    protected Temps oldDebutPlage;
    protected Temps oldFinPlage;

    /**
     * Cree la commande qui permet de modifier une livraison de la tournee
     * 
     * @param livraison
     * @param debutPlage
     * @param finPlage
     */
    public CommandeModifierLivraison(Tournee tournee, Livraison livraison, Temps debutPlage, Temps finPlage) {
	this.tournee = tournee;
	this.livraison = livraison;
	oldDebutPlage = this.livraison.getDebutPlage();
	oldFinPlage = this.livraison.getFinPlage();
	this.debutPlage = debutPlage;
	this.finPlage = finPlage;
    }

    @Override
    public void doCde(Controlleur controlleur) {
	tournee.modifierLivraison(livraison, debutPlage, finPlage);
    }

    @Override
    public void undoCde(Controlleur controlleur) {
	tournee.modifierLivraison(livraison, oldDebutPlage, oldFinPlage);
    }

}