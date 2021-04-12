package mz.guillaume.bpo;

public class Tour extends Piece{
    public Tour(CouleurPiece couleurPiece){
        super(couleurPiece);
    }

    public boolean coupJouable(Plateau p, int x, int y){
        if(!coordonneesValide(x, y)) return false; //DRY !
        if(this.x == x && this.y == y) return false; //DRY !

        if(x != this.x && y != this.y)
            return false;

        //Vérifier qu'il n'y a pas de pièce dans l'intersection
        //Entre la tour et la case visée

        if(p.get(x, y).couleur == couleur)
            return false;

        return true;
    }

    public String toString(){ //Simplifiable
        return couleur == CouleurPiece.BLANC? "T" : "t";
    } //DRY
}
