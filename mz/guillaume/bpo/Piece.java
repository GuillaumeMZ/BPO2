package mz.guillaume.bpo;

public abstract class Piece implements IPiece{
    private CouleurPiece couleur;
    private char representation;

    public CouleurPiece getCouleur(){
        return couleur;
    }

    public Piece(CouleurPiece couleur, char representation){
        assert Character.isLetter(representation) && Character.isLowerCase(representation);
        this.couleur = couleur;
        this.representation = representation;
    }

    @Override
    public String toString() {
        return couleur == CouleurPiece.BLANC?
                String.valueOf(Character.toUpperCase(representation))
                : String.valueOf(representation);
    }
}
