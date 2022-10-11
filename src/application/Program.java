package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMath chessMatch = new ChessMath();
		System.out.println();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Origem: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				System.out.println("Aperte qualquer tecla para continuar");
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println("Aperte qualquer tecla para continuar");
				sc.nextLine();
			}
		}
	}

}
