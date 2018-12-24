/*
POr que el tablero es tipo piece
por que no se inicializa de 8x8 al principio
porque hay una clase para movimiento
porque no
para la posicion mejor una tupla
* */

public class Game {
    Piece [][] board;

    public Game() {
        board = new Piece[8][8];
    }
}
