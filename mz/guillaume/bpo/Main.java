package mz.guillaume.bpo;

public class Main {
    public static void main(String[] args){
        Plateau plateau = new Plateau();
        plateau.placerPiece(0, 0, new Roi(CouleurPiece.BLANC));
        plateau.placerPiece(1, 1 ,new Tour(CouleurPiece.NOIR));
        System.out.println(plateau);
    }
}
