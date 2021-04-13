package mz.guillaume.bpo;

public interface IPiece {
    boolean coupJouable(Plateau plateau, int x, int y);
    String toString();
    CouleurPiece getCouleur();
}
