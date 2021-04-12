package mz.guillaume.bpo;

public class Plateau {
    public static final char[] lettres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    private final Piece[][] plateau;

    public Plateau(){
        plateau = new Piece[8][8];
    }

    public void placerPiece(int x, int y, Piece piece){
        plateau[x][y] = piece;
        piece.bouger(x, y);
    }

    public Piece get(int x, int y){
        return plateau[x][y];
    }

    public void retirerPiece(int x, int y){
        plateau[x][y] = null;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    ");
        for(int i = 0; i < 8; i++)
            stringBuilder.append(lettres[i]).append("   ");
        stringBuilder.append("\n");

        for(int i = 0; i < 8; i++){
            stringBuilder.append(genererLigne()).append("\n");
            stringBuilder.append(8 - i);
            for(int j = 0; j < 8; j++){
                stringBuilder.append(" | ").append(plateau[i][j] != null? plateau[i][j] : " ");
            }
            stringBuilder.append(" | ").append(8-i).append("\n");
        }
        stringBuilder.append(genererLigne());
        stringBuilder.append("\n    ");

        for(int i = 0; i < 8; i++)
            stringBuilder.append(lettres[i]).append("   ");
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    private String genererLigne(){
        return "   " +
                "--- ".repeat(8);
    }
}
