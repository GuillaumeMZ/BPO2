package mz.guillaume.bpo;

public class Roi extends Piece{
    @Override
    public boolean coupJouable(Plateau plateau, int x, int y){
        if(!plateau.coordonneesValides(x, y)) return false; //DRY !
        if(getX() == x && getY() == y) return false; //DRY !

        if(Math.abs(x - getX()) > 1 || Math.abs(y - getY()) > 1)
            return false;

        if(plateau.get(x, y) != null && plateau.get(x, y).getCouleur() == getCouleur())
            return false;

        return true;
    }
    public Roi(CouleurPiece couleur){
        super(couleur, 'r');
    }
}
