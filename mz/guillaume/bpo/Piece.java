package mz.guillaume.bpo;

public abstract class Piece {
    protected int x, y;
    protected CouleurPiece couleur;

    public static boolean coordonneesValide(int x, int y){
        if(x < 0 || x > 7 || y < 0 || y > 7)
            return false;
        return true;
    }

    public void bouger(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Piece(CouleurPiece couleur){
        this.couleur = couleur;
    }

    abstract public String toString();
    abstract public boolean coupJouable(Plateau plateau, int x, int y); //Ca serait pas mal de trouver un moyen d'indiquer que le coup mange une pièce si c'est le cas
}
