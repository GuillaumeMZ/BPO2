package mz.guillaume.bpo;

public class Tour extends Piece{
    public Tour(CouleurPiece couleurPiece){
        super(couleurPiece, 't');
    }

    public boolean coupJouable(Plateau plateau, int x, int y){
        if(!plateau.coordonneesValides(x, y)) return false; //DRY !
        if(getX() == x && getY() == y) return false; //DRY !

        if(x != getX() && y != getY())
            return false;

        //Vérifier qu'il n'y a pas de pièce dans l'intersection
        //Entre la tour et la case visée

        if(plateau.get(x, y).getCouleur() == getCouleur())
            return false;

        return true;
    }
}
