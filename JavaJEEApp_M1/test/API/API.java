package API;

/**
 *
 * @author Marin
 */
public abstract class API {	
    abstract void initialisation();
    abstract boolean action(int coups, int joueur);
    abstract int derniereAction();
    abstract String status();
    abstract int vainqueur();
    abstract String affichage();
}

