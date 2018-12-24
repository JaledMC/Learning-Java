public class Piece {
    /**Save the position of th piece and check if the move is out ofthe board**/
    protected Position position;

    public Piece(int row, int column) {
        position = new Position(row, column);
    }

    public boolean isValidMove(Position newPosition) {
        if(newPosition.row>0 && newPosition.column>0 && newPosition.row<8 && newPosition.column<8) {
            return true;
        }
        else {
            return false;

        }
    }
}
