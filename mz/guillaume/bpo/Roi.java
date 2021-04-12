package mz.guillaume.bpo;

public class Roi extends Piece{

    public String toString(){
        return couleur == CouleurPiece.BLANC? "R" : "r";
    }

    public boolean coupJouable(Plateau plateau, int x, int y){
        if(!coordonneesValide(x, y)) return false; //DRY !
        if(this.x == x && this.y == y) return false; //DRY !

        if(Math.abs(x - this.x) > 1 || Math.abs(y - this.y) > 1)
            return false;

        if(plateau.get(x, y) != null && plateau.get(x, y).couleur == couleur)
            return false;

        return true;
    }

    public Roi(CouleurPiece couleur){
        super(couleur);
    }
}
