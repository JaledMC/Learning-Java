public class Rock extends Piece {
    /**Chek the valid movement method of the parent, and override it with the rook rules**/
    public static int count;
    public Rock(int row, int column) {
        super(row, column);
        count++;
    }
    @Override
    public boolean isValidMove(Position newPosition) {
        if(!super.isValidMove(newPosition)) {
            return false;
        }
        if(newPosition.row == this.position.row || newPosition.column == this.position.column) {
            return true;
        }
        else {
            return false;

        }
    }
}
