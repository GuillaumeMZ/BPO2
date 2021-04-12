package mz.guillaume.bpo;

public class Plateau {
    private static final char[] lettres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    private final Piece[][] plateau;
    private static final int TAILLE_PLATEAU = 8;

    public Plateau(){
        plateau = new Piece[TAILLE_PLATEAU][TAILLE_PLATEAU];
    }

    public void placerPiece(int x, int y, Piece piece){
        //vérifier les coordonnées
        plateau[x][y] = piece;
        piece.bouger(x, y);
    }

    public Piece get(int x, int y){
        //vérifier les coordonnées
        return plateau[x][y];
    }

    public void retirerPiece(int x, int y){
        //vérifier les coordonnées
        plateau[x][y] = null;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("    ");
        s.append(genererLettres());

        for(int i = 0; i < TAILLE_PLATEAU; i++){
            s.append(genererLigne()).append("\n");
            s.append(TAILLE_PLATEAU - i);
            for(int j = 0; j < TAILLE_PLATEAU; j++){
                s.append(" | ").append(plateau[i][j] != null? plateau[i][j] : " ");
            }
            s.append(" | ").append(TAILLE_PLATEAU-i).append("\n");
        }
        s.append(genererLigne());
        s.append("\n    ");
        s.append(genererLettres());

        return s.toString();
    }

    private String genererLettres(){
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < TAILLE_PLATEAU; i++)
            s.append(lettres[i]).append("   ");
        s.append("\n");

        return s.toString();
    }

    private String genererLigne(){
        return "   " +
                "--- ".repeat(TAILLE_PLATEAU);//Nombre magique
    }

    public boolean coordonneesValides(int x, int y){
        if(x < 0 || x >= TAILLE_PLATEAU || y < 0 || y >= TAILLE_PLATEAU)
            return false;
        return true;
    }
}
