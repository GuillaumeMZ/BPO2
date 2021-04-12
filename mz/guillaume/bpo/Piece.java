package mz.guillaume.bpo;

public abstract class Piece {
    private int x, y;
    private CouleurPiece couleur;
    private char representation;

    public void bouger(int x, int y){
        this.x = x;
        this.y = y;
    }

    public CouleurPiece getCouleur(){
        return couleur;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Piece(CouleurPiece couleur, char representation){
        assert Character.isLetter(representation) && Character.isLowerCase(representation);
        this.couleur = couleur;
        this.representation = representation;
    }

    public String toString() {
        return couleur == CouleurPiece.BLANC?
                String.valueOf(Character.toUpperCase(representation))
                : String.valueOf(representation);
    }
    abstract public boolean coupJouable(Plateau plateau, int x, int y); //Ca serait pas mal de trouver un moyen d'indiquer que le coup mange une pièce si c'est le cas
    //quoique osef en fait
}
