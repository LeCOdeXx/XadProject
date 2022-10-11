package application;

import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		
			ChessMath chessMatch = new ChessMath();
			System.out.println();
			UI.printBoard(chessMatch.getPieces());
	}

}
