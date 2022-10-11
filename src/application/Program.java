package application;

import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		
			ChessMath chessMatch = new ChessMath();
			UI.printBoard(chessMatch.getPieces());
	}

}
